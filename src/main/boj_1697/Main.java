package main.boj_1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int k;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
            System.exit(0);
        }

        Queue<Integer> q = new LinkedList<>();
        dist = new int[100001];
        q.offer(n);
        dist[n] = 1;
        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = cur + 1;
                }
                else if (i == 1) {
                    next = cur - 1;
                }
                else {
                    next = cur * 2;
                }

                if (next == k) {
                    System.out.println(dist[cur]);
                    return;
                }

                if (next < 100001 && next >= 0 && dist[next] == 0) { // next의 범위를 벗어나지 않고 dist[next]가 방문을 하지 않았을 때
                    dist[next] = dist[cur] + 1;
                    q.offer(next);
                }
            }
        }
    }
}
