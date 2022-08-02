package re_solve.boj_15663;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1 {
    static int N;
    static int M;
    static int[] arr;
    static int[] selected;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N];
            selected = new int[M];
            visited = new boolean[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            process(0);
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void process(int cnt) {
        if (cnt == M) {
            int x = 0;
            for (int i = 0; i < N; i++) {
                if (visited[i]) {
                    sb.append(selected[x++]).append(" ");
                }
            }
            sb.append("\n");
            return;
        }

        int previous = 0;
        for (int i = 0; i < N; i++) {
            if (!visited[i] && previous != arr[i]) {
                visited[i] = true;
                selected[cnt] = arr[i];
                previous = selected[cnt];
                process(cnt+1);
                visited[i] = false;
            }
        }
    }
}
