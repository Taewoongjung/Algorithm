package main.boj_14889;

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

        back(0, 0);
        System.out.println(min);
    }

    private static void back(int depth, int start) {
        if (depth == N/2) {
            int[] arr = new int[N / 2];
            int[] arr2 = new int[N / 2];
            int j = 0, k = 0;

            for (int i = 0; i < N; i++) {
                if (visited[i]) {
                    arr[j++] = i;
                } else {
                    arr2[k++] = i;
                }
            }

            int s = start(arr);

            int l = link(arr2);

            min = Math.min(min, Math.abs(s - l));
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] =true;
                back(depth + 1, i+1);
                visited[i] = false;
            }
        }
    }

    private static int start(int[] start) {
        int sum = 0;
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < start.length; j++) {
                if (i == j) continue;
                int x = start[i];
                int y = start[j];
                sum += arr[x][y];
            }
        }
        return sum;
    }

    private static int link(int[] link) {
        int sum = 0;
        for (int i = 0; i < link.length; i++) {
            for (int j = 0; j < link.length; j++) {
                if (i == j) continue;
                int x = link[i];
                int y = link[j];
                sum += arr[x][y];
            }
        }
        return sum;
    }
}
