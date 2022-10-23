package re_solve.boj_14890;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int L;
    static int result = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        process();
    }

    public static void process() {

        int[] horizontal = new int[N];
        int[] vertical = new int[N];

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                horizontal[j] = arr[i][j];
                vertical[j] = arr[j][i];
            }

            if (check(horizontal)) result++;
            if (check(vertical)) result++;
        }
        System.out.println(result);
    }

    public static boolean check(int[] arr) {
        int cnt = 0;
        int now = 0;
        int pre = arr[0];

        for (int i = 0; i < N; i++) {
            if (pre == arr[i]) continue;
            if(Math.abs(pre - arr[i]) > 1) return false; // 차이가 2 이상일 때

            else if (pre - arr[i] == 1) { // 내려갈 때
                now = arr[i];
                for (int j = 0; j < L; j++) {
                    if(i + j >= N || now != arr[i + j]) return false;
                    arr[i + j] = 10;
                }
                cnt++;
                i = i + L - 1;
                if (i >= N) break;
            }

            else if (pre - arr[i] == -1) { // 올라갈 때
                now = arr[i];
                for (int j = 1; j <= L; j++) {
                    if(i - j < 0 || now - 1 != arr[i - j]) return false;
                    arr[i - j] = 10;
                }
                cnt++;
            }
            pre = now;
        }
        return true;
    }
}
