package code.plus.boj_15662;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[] visited;
    static int[] isRotate;
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        arr = new int[N][8];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < 8; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }
        }

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int gearNum = Integer.parseInt(st.nextToken()) - 1;
            int direction = Integer.parseInt(st.nextToken());

            visited = new boolean[N]; // 방문 체크
            isRotate = new int[N]; // 회전 예정

            // 방문 체크 후 check 함수 호출
            visited[gearNum] = true;
            check(gearNum, direction);

            // 실제 회전시키기
            rotate();
        }

        // 결과 출력
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] == 1) {
                result++;
            }
        }
        System.out.println(result);
    }

    // 회전 해야할 톱니바퀴 찾기
    public static void check(int now, int dir) {
        isRotate[now] = dir; // now에 방향을 정해놓고 밑에 rotate 함수에서 돌린다.

        int left = now - 1;
        int right = now + 1;

        // 좌측 톱니바퀴가 범위 안에 있고
        if (left >= 0 && left < N) {
            // 서로 맞물린 부분이 서로 다르고, 방문한 적이 없는 톱니바퀴면
            if (arr[left][2] != arr[now][6] && visited[left] == false) {
                // 현재 회전 방향과 반대로 회전
                int newDirection = dir * -1;
                // 방문 체크
                visited[left] = true;
                check(left, newDirection);
            }
        }

        // 우측 톱니바퀴가 범위 안에 있고
        if (right >= 0 && right < N) {
            // 서로 맞물린 부분이 서로 다르고, 방문한 적이 없는 톱니바퀴면
            if (arr[now][2] != arr[right][6] && visited[right] == false) {
                // 현재 회전 방향과 반대로 회전
                int newDirection = dir * -1;
                visited[right] = true;
                check(right, newDirection);
            }
        }
    }

    public static void rotate() {
        for (int i = 0; i < N; i++) {
            // 시계방향 회전
            if (isRotate[i] == 1) {
                int temp = arr[i][7];
                for (int j = 7; j > 0; j--) {
                    arr[i][j] = arr[i][j - 1];
                }
                arr[i][0] = temp;
            }

            // 반시계방향 회전
            if (isRotate[i] == -1) {
                int temp = arr[i][0];
                for (int j = 0; j < 7; j++) {
                    arr[i][j] = arr[i][j + 1];
                }
                arr[i][7] = temp;
            }
        }
    }
}
