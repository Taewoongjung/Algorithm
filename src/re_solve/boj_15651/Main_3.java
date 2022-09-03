package re_solve.boj_15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3 {
    static int N;
    static int M;
    static int[] arr;
    static int[] selected;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        selected = new int[M];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        process(0);
        System.out.println(sb);
    }

    public static void process(int cnt) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            selected[cnt] = arr[i];
            process(cnt + 1);
        }
    }
}
