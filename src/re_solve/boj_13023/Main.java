package re_solve.boj_13023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list[n].add(m);
            list[m].add(n);
        }
        for (int i = 0; i < N; i++) {
            visited = new boolean[N];
            dfs(0, i);
        }
        System.out.println(0);
    }

    public static void dfs(int depth, int x) {
        if (depth == 4) {
            System.out.println(1);
            System.exit(0);
        }
        visited[x] = true;
        for (int next : list[x]) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(depth + 1, next);
                visited[next] = false;
            }
        }
    }
}
