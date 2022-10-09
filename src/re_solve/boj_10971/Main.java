package re_solve.boj_10971;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
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

        for (int i = 0; i < N; i++) {
            visited[i] = true;
            back(i, i, 0, 0);
        }
        System.out.println(min);
    }

    public static void back(int now, int start, int sum, int depth) {

        if (depth == N - 1) {
            if (arr[now][start] != 0) {
                sum += arr[now][start];
                min = Math.min(min, sum);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && arr[now][i] != 0) {
                visited[i] = true;
                back(i, start, sum + arr[now][i], depth + 1);
                visited[i] = false;
            }
        }
    }
}
