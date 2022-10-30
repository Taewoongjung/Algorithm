package main.boj_14503;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int X; // (X,Y)
    static int Y;
    static int D; // 방향
    static int[][] map;
    static boolean[][] visited;
    static int[] dir_x = {-1, 0, 1, 0};
    static int[] dir_y = {0, 1, 0, -1};

    static int result = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        // 북: 0
        // 동: 1
        // 남: 2
        // 서: 3
        D = Integer.parseInt(st.nextToken()); // direction

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[X][Y] = true;

        while (true) {
            boolean flag = true;
            map[X][Y] = 2; // 청소
            for (int i = 0; i < 4; i++) {

                /* 2.
                    북->서
                    동->북
                    남->동
                    서->남
                */
                D = (D + 3) % 4;


                int cur_x = X + dir_x[D];
                int cur_y = Y + dir_y[D];

                if (cur_x >= 0 && cur_x < N && cur_y >= 0 && cur_y < M && map[cur_x][cur_y] == 0) { // 1. 왼쪽 방향에 아직 청소하지 않은 공간이 존재한다면, 그 방향으로 회전한 다음 한 칸을 전진하고 1번부터 진행한다.
                    flag = false;
                    X = cur_x;
                    Y = cur_y;
                    result++;
                    break;
                }
            }

            if (flag) { // 3. 네 방향 모두 청소가 이미 되어있거나 벽인 경우에는, 바라보는 방향을 유지한 채로 한 칸 후진을 하고 2번으로 돌아간다.
                X = X - dir_x[D];
                Y = Y - dir_y[D];
                if(map[X][Y] == 1) break; // 4. 네 방향 모두 청소가 이미 되어있거나 벽이면서, 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.
            }
        }

        System.out.println(result);
    }
}
