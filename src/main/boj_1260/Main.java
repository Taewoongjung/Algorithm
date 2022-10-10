package main.boj_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int V;
    static int[][] map;
    static boolean[] visited;
    static ArrayList<TreeMap<Integer, Integer>> arrayList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        arrayList = new ArrayList<>();

        for (int i = 0; i < N + 1; i++) {
            Arrays.fill(map[i], 0);
            arrayList.add(new TreeMap<Integer, Integer>());
        }

        Arrays.fill(visited, false);
        for (int i = 0; i < M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
            arrayList.get(a).put(b, a);
            arrayList.get(b).put(a, b);
        }
        visited[V] = true;
        dfs(V);
        System.out.println();
        Arrays.fill(visited, false);
        bfs(V);
    }

    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        TreeMap<Integer, Integer> temp = arrayList.get(v); // 순서에 상관이 있기 때문에 TreeMap을 사용(TreeMap은 자동으로 소트 되니까)
        for (int i : temp.keySet()) { // 순서가 상관없다면 arrayList를 사용해도 무방하다.
            if (!visited[i]) {
                visited[v] = true;
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;
        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp + " ");

            for (int i = 1; i <= N; i++) { // 인접 행렬로 하는 경우 1, N 을 하고 map[temp][i] == 1 을 한다.
                if (map[temp][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
