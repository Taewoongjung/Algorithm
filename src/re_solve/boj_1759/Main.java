package re_solve.boj_1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static char arr[];
    static char selected[];
    static boolean visited[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[M];
        selected = new char[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);

        process(0, 0, 0, 0);
        System.out.println(sb);
    }

    private static void process(int cnt, int idx, int v, int c) {
        if (cnt == N) {
            if (v >= 1 && c >= 2) {
                for (int i = 0; i < N; i++) {
                    sb.append(selected[i]);
                }
                sb.append("\n");
            }
            return;
        }

        for (int i = idx; i < M; i++) {
            selected[cnt] = arr[i];

            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                process(cnt + 1, i + 1, v + 1, c);
            } else {
                process(cnt + 1, i + 1, v, c + 1);
            }
        }
    }
}
