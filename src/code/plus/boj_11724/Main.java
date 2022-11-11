package code.plus.boj_11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 연결요소 (Connected Component) 문제는 Main에서 for문이 있는 문제이다. 외우자. 아니면 그냥 Main에 dfs 만 있다.
// 이 문제는 연결요소 문제이니까 Main에 for문이 있는 것이다.

public class Main {
    static int N;
    static int M;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        adj = new ArrayList[N + 1];
        visited = new boolean[N + 1]; // index를 1부터 사용하기 때문에 N+1 로 한다.

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

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int cur) { // cur = current 를 뜻한다.
        for (int next : adj[cur]) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next);
                // 찐 dfs는 false 가 없다. 왜냐하면 다시 돌아가서 재탐색 하는 것이 아니기 때문이다.
            }
        }
    }
}
