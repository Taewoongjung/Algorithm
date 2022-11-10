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

            List<Integer> d_list = new ArrayList<>();  //  d_list를 만든다
            d_list.add(d);  //  d_list에  입력받은 d를 넣는다.
            for (int k = 0; k < g; k++) {
                for (int j = d_list.size() - 1; j >= 0; j--) {  // 앞 세대까지의 커브를 뒤집은 상태(3,2,1,0)를 반시계로 1칸 민 것이
                    // 그 다음 세대의 뒷 부분(4,5,6,7)과 겹친다. j를 d_list의 가장 뒤부터 읽는다.
                    d_list.add((d_list.get(j) + 1) % 4);
                }
            }

            //처음 입력받은 (x,y)에다가 위에서 만든 d_list의 모든 direction을 누적시키면서 map에 색칠한다.
            map[y][x] = true;
            for (int dir : d_list) {
                x = x + dir_x[dir];
                y = y + dir_y[dir];
                map[y][x] = true;
            }
        }

        // (0,0)~(99,99)보면서 모든 꼭지점이 true인 경우에는 ans에 1 더한다.
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
