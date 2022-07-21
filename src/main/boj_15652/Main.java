package main.boj_15652;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N];
            selected = new int[M];

            for (int i = 0; i < N; i++) {
                arr[i] = i + 1;
            }
            process(0, 1);
            System.out.println(sb);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void process(int cnt, int idx) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx - 1; i < N; i++) {
            selected[cnt] = arr[i];
            process(cnt + 1, i + 1);
        }
    }
}
