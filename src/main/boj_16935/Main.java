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
        int h = arr.length; // current height
        int w = arr[0].length; // current width
        for (int i = 0; i < h / 2; i++) {
            for (int j = 0; j < w; j++) {
                int temp = arr[h - i - 1][j];
                arr[h - i - 1][j] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }

    public static void f2() {
        int h = arr.length; // current height
        int w = arr[0].length; // current width
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w / 2; j++) {
                int temp = arr[i][w - j - 1];
                arr[i][w - j - 1] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }

    public static void f3() {
        int h = arr.length; // current height
        int w = arr[0].length; // current width
        int[][] temp = new int[w][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                temp[j][h - i - 1] = arr[i][j];
            }
        }
        arr = temp;
    }

    public static void f4() {
        int h = arr.length; // current height
        int w = arr[0].length; // current width
        int[][] temp = new int[w][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                temp[j][i] = arr[i][w - j - 1];
            }
        }
        arr = temp;
    }

    public static void f5() {
        int h = arr.length; // current height
        int w = arr[0].length; // current width

//                1->2,
//                2->3,
//                3->4,
//                4->1
        int[][] temp = new int[h][w];

//                1 -> 2
        for (int i = 0; i < h/2; i++) {
            for (int j = 0; j < w/2; j++) {
                temp[i][w/2 + j] = arr[i][j];
            }
        }

//                2 -> 3
        for (int i = 0; i < h/2; i++) {
            for (int j = w/2; j < w; j++) {
                temp[h/2 + i][j] = arr[i][j];
            }
        }

//                3 -> 4
        for (int i = h/2; i < h; i++) {
            for (int j = w/2; j < w; j++) {
                temp[i][j - (w / 2)] = arr[i][j];
            }
        }

//                4 -> 1
        for (int i = h/2; i < h; i++) {
            for (int j = 0; j < w/2; j++) {
                temp[i - (h / 2)][j] = arr[i][j];
            }
        }
        arr = temp;
    }

    public static void f6() {
        int h = arr.length; // current height
        int w = arr[0].length; // current width
//                1->4,
//                4->3,
//                3->2,
//                2->1
        int[][] temp = new int[h][w];

//                1 -> 4
        for (int i = 0; i < h/2; i++) {
            for (int j = 0; j < w/2; j++) {
                temp[i + (h / 2)][j] = arr[i][j];
            }
        }

//                4 -> 3
        for (int i = h/2; i < h; i++) {
            for (int j = 0; j < w/2; j++) {
                temp[i][j + (w / 2)] = arr[i][j];
            }
        }

//                3 -> 2
        for (int i = h/2; i < h; i++) {
            for (int j = w/2; j < w; j++) {
                temp[i - (h / 2)][j] = arr[i][j];
            }
        }

//                2 -> 1
        for (int i = 0; i < h/2; i++) {
            for (int j = w/2; j < w; j++) {
                temp[i][j - (w / 2)] = arr[i][j];
            }
        }

        arr = temp;
    }
}
