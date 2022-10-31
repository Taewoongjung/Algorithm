package re_solve.boj_15685;

import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static boolean[][] map = new boolean[101][101];
    static int result = 0;

    static int[] dir_x = {1, 0, -1, 0};
    static int[] dir_y = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            List<Integer> direction_list = new ArrayList<>();
            direction_list.add(d);

            for (int j = 0; j < g; j++) {
                for (int k = direction_list.size() - 1; k >= 0; k--) {
                    direction_list.add((direction_list.get(k) + 1) % 4);
                }
            }

            map[y][x] = true;

            for (int direction : direction_list) {
                x = x + dir_x[direction];
                y = y + dir_y[direction];
                map[y][x] = true;
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (map[i][j] && map[i + 1][j] && map[i][j + 1] && map[i + 1][j + 1]) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
