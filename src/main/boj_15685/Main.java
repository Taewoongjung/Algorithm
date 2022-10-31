package main.boj_15685;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static boolean[][] map = new boolean[101][101];
    static int[] dir_x = {1, 0, -1, 0}; // 여기서는 x가 가로
    static int[] dir_y = {0, -1, 0, 1}; // 여기서는 y가 세로
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        /*
            0: x좌표가 증가하는 방향 (→)
            1: y좌표가 감소하는 방향 (↑)
            2: x좌표가 감소하는 방향 (←)
            3: y좌표가 증가하는 방향 (↓)
        */

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken()); // 시작 방향
            int g = Integer.parseInt(st.nextToken()); // 세대

            List<Integer> d_list = new ArrayList<>();
            d_list.add(d);
            for (int k = 0; k < g; k++) {
                for (int j = d_list.size() - 1; j >= 0; j--) {
                    d_list.add((d_list.get(j) + 1) % 4);
                }
            }

            map[y][x] = true;
            for (int dir : d_list) {
                x = x + dir_x[dir];
                y = y + dir_y[dir];
                map[y][x] = true;
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (map[i][j] && map[i][j + 1] && map[i + 1][j] && map[i + 1][j + 1]) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
