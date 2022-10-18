package re_solve.boj_16926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int R;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = Math.min(N, N) / 2;
        for (int i = 0; i < count; i++) {
            int interval = (N - 2 * i) + (N - 2 * i) + (M - 2 * i) + (M - 2 * i) - 4;
            int rear_r = R % interval;
            for (int j = 0; j < rear_r; j++) {
                int temp = arr[i][i];

                for (int k = i + 1; k < M - i; k++) {
                    arr[i][k - 1] = arr[i][k];
                }

                for (int k = i + 1; k < N - i; k++) {
                    arr[k - 1][M - 1 - i] = arr[k][M - 1 - i];
                }

                for (int k = M - 2 - i; k >= i; k--) {
                    arr[N - 1 - i][k + 1] = arr[N - 1- i][k];
                }

                for (int k = N - 2 - i; k >= i; k--) {
                    arr[k + 1][i] = arr[k][i];
                }

                arr[i+1][i] = temp;
            }
        }

    }
}
