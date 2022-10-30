package re_solve.boj_14503;

import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int X;
    static int Y;
    static int D;
    static int[][] map = new int[50][50];

    static int[] dir_x = {-1, 0, 1, 0}; // 북 동 남 서
    static int[] dir_y = {0, 1, 0, -1}; // 북 동 남 서
    static int result = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        while (true) {
            boolean flag = true;
            map[X][Y] = 2; // 청소

            for (int i = 0; i < 4; i++) {
                D = (D + 3) % 4;

                int cur_x = X + dir_x[D];
                int cur_y = Y + dir_y[D];


                if (cur_x >= 0 && cur_x < N && cur_y >= 0 && cur_y < M && map[cur_x][cur_y] == 0) {
                    flag = false;
                    result++;
                    X = cur_x;
                    Y = cur_y;
                    break;
                }
            }
            if (flag) {
                X = X - dir_x[D];
                Y = Y - dir_y[D];
                if(map[X][Y] == 1) break;
            }
        }
        System.out.println(result);
    }
}
