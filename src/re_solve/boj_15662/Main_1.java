package re_solve.boj_15662;

import java.io.*;
import java.util.*;

public class Main_1 {
    static int T;
    static int K;
    static int[][] gear;
    static boolean[] visited;
    static int[] isRotate;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        gear = new int[T][8];
        visited = new boolean[T];
        isRotate = new int[T];

        for (int i = 0; i < T; i++) {
            String temp = br.readLine();
            for (int j = 0; j < 8; j++) {
                gear[i][j] = temp.charAt(j) - '0';
            }
        }

        K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int now = Integer.parseInt(st.nextToken()) - 1;
            int direction = Integer.parseInt(st.nextToken());

            visited[now] = true;
            check(now, direction); // 현재 톱니바퀴의 양 옆(오른쪽 왼쪽) 톱니바퀴를 체크
            rotate();
        }

        int result = 0;
        for (int i = 0; i < T; i++) {
            if (gear[i][0] == 1) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static void check(int now, int direction) {
        isRotate[now] = direction;
        int right = now + 1;
        int left = now - 1;

        if (right >= 0 && right < T) {
            if (gear[now][2] != gear[right][6] && !visited[right]) {
                int newDirection = direction * -1;
                visited[right] = true;
                check(right, newDirection);
            }
        }

        if (left >= 0 && left < T) {
            if (gear[now][6] != gear[left][2] && !visited[left]) {
                int newDirection = direction * -1;
                visited[left] = true;
                check(left, newDirection);
            }
        }
    }

    public static void rotate() {
        for (int i = 0; i < T; i++) {
            if (isRotate[i] == 1) { // 시계방향
                int temp = gear[i][7];
                for (int j = 7; j > 0; j--) {
                    gear[i][j] = gear[i][j - 1];
                }
                gear[i][0] = temp;
            }

            if (isRotate[i] == -1) { // 반시게방향
                int temp = gear[i][0];
                for (int j = 0; j < 7; j++) {
                    gear[i][j] = gear[i][j + 1];
                }
                gear[i][7] = temp;
            }
        }
    }
}
