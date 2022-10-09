package main.boj_10819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static int[] tarr;
    static boolean[] visited;

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        tarr = new int[N];
        visited = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        back(0);
        System.out.println(max);
    }

    public static void back(int depth) {
        if (depth == N) {
            int sum =0;
            for (int i = 0; i < N - 1 ; i++) {
                sum += Math.abs(tarr[i] - tarr[i+1]);
            }
            max = Math.max(max,sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                tarr[depth] = i;
                back(depth + 1);
                visited[i] = false;
            }
        }
    }
}
