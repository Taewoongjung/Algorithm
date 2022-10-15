package main.boj_16935;

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

        st = new StringTokenizer(br.readLine());
        for (int r = 0; r < R; r++) {
            O = Integer.parseInt(st.nextToken());
            switch (O) {
                case 1:
                    f1();
                    break;
                case 2:
                    f2();
                    break;
                case 3:
                    f3();
                    break;
                case 4:
                    f4();
                    break;
                case 5:
                    f5();
                    break;
                case 6:
                    f6();
                    break;
            }
        }
        // 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void f1() {
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < M; j++) {
                int temp = arr[N - i - 1][j];
                arr[N - i - 1][j] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }

    public static void f2() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M / 2; j++) {
                int temp = arr[i][M - j - 1];
                arr[i][M - j - 1] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }

    public static void f3() {
        int[][] temp = new int[arr[0].length][arr.length];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                temp[j][N - i - 1] = arr[i][j];
            }
        }
        arr = temp;
    }

    public static void f4() {
        arr = new int[N][M];
        int[][] temp = new int[arr[0].length][arr.length];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                temp[j][i] = arr[i][M - j - 1];
            }
        }
        arr = temp;
    }

    public static void f5() {
//                1->2,
//                2->3,
//                3->4,
//                4->1
        int[][] temp = new int[N][M];

//                1 -> 2
        for (int i = 0; i < N/2; i++) {
            for (int j = 0; j < M/2; j++) {
                temp[i][M/2 + j] = arr[i][j];
            }
        }

//                2 -> 3
        for (int i = 0; i < N/2; i++) {
            for (int j = M/2; j < M; j++) {
                temp[N/2 + i][j] = arr[i][j];
            }
        }

//                3 -> 4
        for (int i = N/2; i < N; i++) {
            for (int j = M/2; j < M; j++) {
                temp[i][j - (M / 2)] = arr[i][j];
            }
        }

//                4 -> 1
        for (int i = N/2; i < N; i++) {
            for (int j = 0; j < M/2; j++) {
                temp[i - (N / 2)][j] = arr[i][j];
            }
        }
        arr = temp;
    }

    public static void f6() {
//                1->4,
//                4->3,
//                3->2,
//                2->1
        int[][] temp = new int[N][M];

//                1 -> 4
        for (int i = 0; i < N/2; i++) {
            for (int j = 0; j < M/2; j++) {
                temp[i + (N / 2)][j] = arr[i][j];
            }
        }

//                4 -> 3
        for (int i = N/2; i < N; i++) {
            for (int j = 0; j < M/2; j++) {
                temp[i][j + (M / 2)] = arr[i][j];
            }
        }

//                3 -> 2
        for (int i = N/2; i < N; i++) {
            for (int j = M/2; j < M; j++) {
                temp[i - (N / 2)][j] = arr[i][j];
            }
        }

//                2 -> 1
        for (int i = 0; i < N/2; i++) {
            for (int j = M/2; j < M; j++) {
                temp[i][j - (M / 2)] = arr[i][j];
            }
        }

        arr = temp;
    }
}
