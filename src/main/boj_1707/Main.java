package main.boj_1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] color;
    static String result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_case = Integer.parseInt(br.readLine());
        for (int k = 0; k < test_case; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            adj = new ArrayList[N + 1];
            visited = new boolean[N + 1]; // index를 1부터 사용하기 때문에 N+1 로 한다.
            color = new int[N + 1];

            for (int i = 1; i <= N; i++) {  // 인접 리스트를 입력받는 틀은 외우자
                adj[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < M; i++) { // 인접 리스트를 입력받는 틀은 외우자
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st1.nextToken());
                int v = Integer.parseInt(st1.nextToken());
                adj[u].add(v);
                adj[v].add(u);
                // 인접 리스트 만들기.
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
        visited[start] = true;
        color[start] = 1; //1:Red, 2:Blue
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : adj[cur]) {
                if (!visited[next]) {
                    visited[next] = true;

                    // color[next] = 3 - color[cur];
                    if (color[cur] == 1) color[next] = 2;
                    else color[next] = 1;

                    q.offer(next);
                } else {
                    if (color[next] == color[cur]) { //이분그래프가 아님!!
                        result = "NO";
                    }
                }
            }
        }
    }
}
