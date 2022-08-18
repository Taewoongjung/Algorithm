package re_solve.boj_15649;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_6 {
    static int N;
    static int M;
    static int[] arr;
    static int[] selected;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void process(int cnt) {
        if (M == cnt) {
            int x = 0;
            for (int i = 0; i < N; i++) {
                if (visited[i]) {
                    sb.append(selected[x++]).append(" ");
                }
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[cnt] = arr[i];
                process(cnt + 1);
                visited[i] = false;
            }
        }
    }
}
