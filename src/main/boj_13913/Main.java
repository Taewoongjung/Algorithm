package main.boj_13913;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int K;
    static int[] dist = new int[100001];
    static int[] parent = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        Arrays.fill(dist, -1);
        dist[N] = 0; // 해당 index에 요소가 있으면 0, 없으면 -1
        parent[N] = -1;

        if (N == K) {
            System.out.println(0);
            System.exit(0);
        }

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == K) {
                System.out.println(dist[cur]);

                int v = cur;

                ArrayList<Integer> path = new ArrayList<>();
                while (true) {
                    path.add(v);
                    if (v == N) break; // 출발지 까지 왔기 때문에 빠져 나온다.
                    v = parent[v];
                }

                Collections.reverse(path);
                for (int i : path) {
                    System.out.print(i + " ");
                }

                System.exit(0);
            }

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = cur * 2;
                } else if (i == 1) {
                    next = cur - 1;
                }
                else {
                    next = cur + 1;
                }

                if (next >= 0 && next < 100001 && dist[next] == -1) {
                    dist[next] = dist[cur] + 1;
                    parent[next] = cur;
                    q.offer(next);
                }
            }
        }
    }
}
