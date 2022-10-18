package re_solve.boj_14499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int cur_x;
    static int cur_y;
    static int K;
    static int[][] map;
    static int[] cur_dice;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cur_x = Integer.parseInt(st.nextToken());
        cur_y = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cur_dice = new int[6];
        int Bottom = 0;
        int Front = 1;
        int Top = 2;
        int Back = 3;
        int Left = 4;
        int Right = 5;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            int dir = Integer.parseInt(st.nextToken());

            if (dir == 1) { // 동쪽으로 회전
                int next_x = cur_x + 0;
                int next_y = cur_y + 1;

                if(next_x < 0 || next_x >= N || next_y < 0 || next_y >= M) continue;

                int[] next_dice = new int[6];
                next_dice[Left] = cur_dice[Bottom];
                next_dice[Bottom] = cur_dice[Right];
                next_dice[Right] = cur_dice[Top];
                next_dice[Top] = cur_dice[Left];

                if (map[next_x][next_y] == 0) {
                    map[next_x][next_y] = next_dice[Bottom];
                } else {
                    next_dice[Bottom] = map[next_x][next_y];
                    map[next_x][next_y] = 0;
                }

                cur_x = next_x;
                cur_y = next_y;

                cur_dice[Left] = next_dice[Left];
                cur_dice[Bottom] = next_dice[Bottom];
                cur_dice[Right] = next_dice[Right];
                cur_dice[Top] = next_dice[Top];
            }

            if (dir == 2) { // 서쪽으로 회전
                int next_x = cur_x + 0;
                int next_y = cur_y - 1;

                if(next_x < 0 || next_x >= N || next_y < 0 || next_y >= M) continue;

                int[] next_dice = new int[6];
                next_dice[Top] = cur_dice[Right];
                next_dice[Left] = cur_dice[Top];
                next_dice[Bottom] = cur_dice[Left];
                next_dice[Right] = cur_dice[Bottom];

                if (map[next_x][next_y] == 0) {
                    map[next_x][next_y] = next_dice[Bottom];
                } else {
                    next_dice[Bottom] = map[next_x][next_y];
                    map[next_x][next_y] = 0;
                }

                cur_x = next_x;
                cur_y = next_y;

                cur_dice[Top] = next_dice[Top];
                cur_dice[Left] = next_dice[Left];
                cur_dice[Bottom] = next_dice[Bottom];
                cur_dice[Right] = next_dice[Right];
            }

            if (dir == 3) { // 북쪽으로 회전
                int next_x = cur_x - 1;
                int next_y = cur_y + 0;

                if(next_x < 0 || next_x >= N || next_y < 0 || next_y >= M) continue;

                int[] next_dice = new int[6];
                next_dice[Back] = cur_dice[Top];
                next_dice[Bottom] = cur_dice[Back];
                next_dice[Front] = cur_dice[Bottom];
                next_dice[Top] = cur_dice[Front];

                if (map[next_x][next_y] == 0) {
                    map[next_x][next_y] = next_dice[Bottom];
                } else {
                    next_dice[Bottom] = map[next_x][next_y];
                    map[next_x][next_y] = 0;
                }

                cur_x = next_x;
                cur_y = next_y;

                cur_dice[Back] = next_dice[Back];
                cur_dice[Bottom] = next_dice[Bottom];
                cur_dice[Front] = next_dice[Front];
                cur_dice[Top] = next_dice[Top];
            }

            if (dir == 4) { // 남쪽으로 회전
                int next_x = cur_x + 1;
                int next_y = cur_y + 0;

                if(next_x < 0 || next_x >= N || next_y < 0 || next_y >= M) continue;

                int[] next_dice = new int[6];
                next_dice[Top] = cur_dice[Back];
                next_dice[Front] = cur_dice[Top];
                next_dice[Bottom] = cur_dice[Front];
                next_dice[Back] = cur_dice[Bottom];

                if (map[next_x][next_y] == 0) {
                    map[next_x][next_y] = next_dice[Bottom];
                } else {
                    next_dice[Bottom] = map[next_x][next_y];
                    map[next_x][next_y] = 0;
                }

                cur_x = next_x;
                cur_y = next_y;

                cur_dice[Top] = next_dice[Top];
                cur_dice[Front] = next_dice[Front];
                cur_dice[Bottom] = next_dice[Bottom];
                cur_dice[Back] = next_dice[Back];
            }
            System.out.println(cur_dice[Top]);
        }
    }
}
