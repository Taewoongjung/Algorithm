package re_solve.boj_15661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int T;
    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (T = 1; T < N; T++) {
            back(0, 0);
        }
        System.out.println(min);
    }

    public static void back(int depth, int start) {
        if (depth == T) {
            min = Math.min(min, diff());
            return;
        }
        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                back(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }

    public static int diff() {
        int start = 0;
        int link = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    start += (arr[i][j] + arr[j][i]);
                }
                if (!visited[i] && !visited[j]) {
                    link += (arr[i][j] + arr[j][i]);
                }
            }
        }

        return Math.abs(start - link);
    }
}
