package re_solve.boj_15662;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int T;
    static int[][] gear;
    static int[] isRotate;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        gear = new int[N][8];
        isRotate = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < 8; j++) {
                gear[i][j] = temp.charAt(j) - '0';
            }
        }

        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int cur_gear = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());

            visited[cur_gear] = true;
            check(cur_gear, direction);

            rotate();
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            if (gear[i][0] == 1) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static void check(int cur_gear, int direction) {
        isRotate[cur_gear] = direction;

        int right = cur_gear + 1;
        int left = cur_gear - 1;

        if (right >= 0 && right < N) {
            if (gear[cur_gear][2] != gear[right][6] && !visited[cur_gear] ) {
                int newDirection = direction * -1;
                visited[right] = true;

                check(right, newDirection);
            }
        }

        if (left >= 0 && left < N) {
            if (gear[left][6] != gear[cur_gear][2] && !visited[cur_gear]) {
                int newDirection = direction * -1;
                visited[left] = true;

                check(left, newDirection);
            }
        }
    }

    public static void rotate() {
        for (int i = 0; i < N; i++) {
            if (isRotate[i] == -1) { // 반시계방향
                int temp = gear[i][0];
                for (int j = 0; j < 7; j++) {
                    gear[i][j] = gear[i][j + 1];
                }
                gear[i][7] = temp;
            }

            if (isRotate[i] == 1) { // 시계방향
                int temp = gear[i][7];
                for (int j = 7; j > 0; j--) {
                    gear[i][j] = gear[i][j - 1];
                }
                gear[i][0] = temp;
            }
        }
    }
}
