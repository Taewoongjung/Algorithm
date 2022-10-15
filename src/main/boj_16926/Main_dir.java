package main.boj_16926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_dir {
    static int N;
    static int M;
    static int R;
    static int[][] arr;
    static int[] dir_x = {0, 0, 1, -1};
    static int[] dir_y = {1, -1, 0, 0};

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

        int count = Math.min(N, M) / 2;
        for (int r = 0; r < R; r++) {

            for (int i = 0; i < count; i++) {
                int cur_x = i;
                int cur_y = i;

                int[][] temp = new int[cur_x][cur_y];

                int dir = 0;
                while (dir < 4) {
                    int next_x = cur_x + dir_x[dir];
                    int next_y = cur_y + dir_y[dir];
                }

            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
