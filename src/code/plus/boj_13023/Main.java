package code.plus.boj_13023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static ArrayList<Integer>[] list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) { // 관계 입력 (양방향) 해서 "인접리스트" 만들기
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list[n].add(m);
            list[m].add(n);
        }

        for (int i = 0; i < N; i++) { // '0' 부터 가보고 그 다음 '1' 그 다음 '2' ... 가보는거
            visited = new boolean[N];
            back(0, i); // 0에서 N까지 탐색 (i로 들어감)
        }
        System.out.println(0);
    }

    public static void back(int depth, int x) {
        if(depth == 4) {
            System.out.println(1);
            System.exit(0);
        }

        visited[x] = true;
        for(int next : list[x]) {
            if(!visited[next]) {
                visited[next] = true;
                back(depth + 1, next);
                visited[next] = false;
            }
        }
    }
}
