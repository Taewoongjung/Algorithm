package re_solve.boj_15657;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_2 {
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

        HashMap a = new HashMap();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        process(0, 0);
        System.out.println(sb);
    }

    public static void process(int cnt, int idx) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i < N; i++) {
            selected[cnt] = arr[i];
            process(cnt + 1, i);
        }
    }
}
