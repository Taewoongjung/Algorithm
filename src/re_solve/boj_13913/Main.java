package re_solve.boj_13913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int K;
    static int[] arr = new int[100001];
    static int[] parent = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(arr, -1);
        q.offer(N);
        arr[N] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == K) {
                System.out.println(arr[cur]);

                int v = cur;
                List<Integer> path = new ArrayList<>();
                while (true) {
                    path.add(v);
                    if (v == N) break;
                    v = parent[v];
                }

                Collections.reverse(path);
                for (int i : path) {
                    System.out.print(i + " ");
                }
                return;
            }

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = cur * 2;
                }
                else if (i == 1) {
                    next = cur - 1;
                }
                else {
                    next = cur + 1;
                }

                if (next < 100001 && next >= 0 && arr[next] == -1) {
                    arr[next] = arr[cur] + 1;
                    parent[next] = cur;
                    q.offer(next);
                }
            }
        }
    }
}
