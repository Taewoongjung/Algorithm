package re_solve.boj_1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int C;
    static int N;
    static int M;
    static ArrayList<Integer>[] arrayLists;
    static boolean[] visited;
    static int[] color;
    static String result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        C = Integer.parseInt(br.readLine());

        for (int a = 0; a < C; a++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            visited = new boolean[N + 1];
            arrayLists = new ArrayList[N + 1];
            color = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                arrayLists[i] = new ArrayList<>();
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                arrayLists[n].add(m);
                arrayLists[m].add(n);
            }

            result = "YES";
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    bfs(i);
                }
            }
            System.out.println(result);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        color[start] = 1; // 1: Red, 2: Blue
        visited[start] = true;
        q.offer(start);

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int next : arrayLists[temp]) {
                if (!visited[next]) {
                    visited[next] = true;

                    if(color[temp] == 1) color[next] = 2;
                    else color[next] = 1;

                    q.offer(next);
                } else {
                    if (color[next] == color[temp]) {
                        result = "NO";
                    }
                }
            }
        }
    }
}
