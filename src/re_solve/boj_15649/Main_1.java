package re_solve.boj_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visited = new boolean[N];
        selected = new int[M];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        process(0);
        System.out.println(sb);
    }

    public static void process(int cnt) {
        if (cnt == M) {
            int x = 0;
            for (int j = 0; j < N; j++) {
                if (visited[j]) {
                    sb.append(selected[x++]).append(" ");
                }
            }
            sb.append('\n');
            return;
        }

        for (int j = 0; j < N; j++) {
            if (!visited[j]) {
                visited[j] = true;
                selected[cnt] = arr[j];
                process(cnt + 1);
                visited[j] = false;
            }
        }
    }
}
