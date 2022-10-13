package re_solve.boj_1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int K;
    static int[] dist = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        dist[N] = 1;

        if (N == K) {
            System.out.println(0);
            System.exit(0);
        }

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = cur + 1;
                } else if (i == 1) {
                    next = cur - 1;
                }
                else {
                    next = cur * 2;
                }

                if (next == K) {
                    System.out.println(cur);
                    System.out.println(dist[cur]);
                    return;
                }

                if (next >= 0 && next < 100001 && dist[next] == 0) {
                    dist[next] = dist[cur] + 1;
                    q.offer(next);
                }
            }
        }
    }
}
