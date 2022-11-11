package code.plus.boj_14890;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int L;
    static int[][] map;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            int[] horizontal = new int[N];
            int[] vertical = new int[N];

            for (int j = 0; j < N; j++) {
                horizontal[j] = map[i][j];
                vertical[j] = map[j][i];
            }

            if(check(horizontal)) result++;
            if(check(vertical)) result++;
        }
        System.out.println(result);
    }

    public static boolean check(int[] line) {
        int cnt = 0;
        int now = 0;
        int pre = line[0];

        for (int i = 0; i < N; i++) {
            if (pre == line[i]) continue; // 이전 지형과 높이가 같다면 pass
            if(Math.abs(pre - line[i]) > 1) return false; // 이전 지형과 비교해서 높이의 차가 1 초과이면 더 이상 못가기 때문에 false

            else if (pre - line[i] == 1) { // 이전 지형보다 1 더 낮다면
                // 경사로를 놓을 수 있는지 확인
                now = line[i];
                for (int j = 0; j < L; j++) {
                    if (i + j >= N || now != line[i + j]) return false; // 지도를 벗어나거나 이전 지형과 같지 않다면 경사로를 놓지 못하기 때문에 false
                    // 경사로를 놓았다고 체크
                    line[i + j] = 10;
                }
                cnt++; // 경사로 사용
                // +L+1 부터 다시 확인
                i = i + L - 1;
                if (i >= N) break;
            }

            // 이전 지형보다 1 더 높다면
            else if (pre - line[i] == -1) {
                // 경사로를 놓을 수 있는지 확인
                now = line[i];
                for (int j = 1; j <= L; j++) {
                    // 경사로를 놓지 못한다면
                    if (i - j < 0 || now - 1 != line[i - j]) return false;
                    // 경사로를 놓았다고 체크
                    line[i - j] = 10;
                }
                cnt++; // 경사로 사용
            }
            pre = now;
        }
        return true;
    }
}
