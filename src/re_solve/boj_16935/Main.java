package re_solve.boj_16935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int R;
    static int O;
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

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        O = Integer.parseInt(br.readLine());

        if (O == 1) {
            for (int i = 0; i < N/2; i++) {
                for (int j = 0; j < M; j++) {
                    int temp = arr[N - i - 1][j];
                    arr[N - i - 1][j] = arr[i][j];
                    arr[i][j] = temp;
                }
            }
        }
        else if (O == 2) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M/2; j++) {
                    int temp = arr[i][M - 1 - j];
                    arr[i][M - 1 - j] = arr[i][j];
                    arr[i][j] = temp;
                }
            }
        }

        else if (O == 3) {
            int[][] temp = new int[arr[0].length][arr.length];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    temp[j][N - i -1] = arr[i][j];
                }
            }
            arr = temp;
        }

        else if (O == 4) {
            int[][] temp = new int[arr[0].length][arr.length];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    temp[j][i] = arr[i][M - j - 1];
                }
            }
            arr = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
