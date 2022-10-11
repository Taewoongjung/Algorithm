package re_solve.boj_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int V;

    static ArrayList<TreeMap<Integer, Integer>> arrayLists;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        arrayLists = new ArrayList<>();

        for (int i = 0; i < N + 1; i++) {
            arrayLists.add(new TreeMap<Integer, Integer>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            arrayLists.get(n).put(m, n);
            arrayLists.get(m).put(n, m);
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
        TreeMap<Integer, Integer> treeMap = arrayLists.get(v);
        for (int next : treeMap.keySet()) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.offer(v);

        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp + " ");

            TreeMap<Integer, Integer> treeMap = arrayLists.get(temp);
            for (int next : treeMap.keySet()) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
    }
}
