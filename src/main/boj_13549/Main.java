package main.boj_13549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int K;
    static int[] arr = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        Arrays.fill(arr, -1);
        arr[N] = 0;

        if (N == K) {
            System.out.println(0);
            System.exit(0);
        }

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == K) {
                System.out.println(arr[cur]);
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

                if (next >= 0 && next < 100001 && arr[next] == -1) {
                    if (i == 0) arr[next] = arr[cur] + 0;
                    else arr[next] = arr[cur] + 1;
                    q.offer(next);
                }
            }
        }
    }
}
