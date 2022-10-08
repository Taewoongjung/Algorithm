package main.boj_15661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://coder-in-war.tistory.com/entry/BOJ-JAVA15661-%EB%A7%81%ED%81%AC%EC%99%80-%EC%8A%A4%ED%83%80%ED%8A%B8

public class Main {
    static int N;
    static int T; // 팀원 수
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

        // 팀원이 절반으로 떨어지는 것이 아니기 때문에 가능한 경우의 수를 모두 탐색한다.
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

    private static int diff() {
        int start = 0;
        int link = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    start += (arr[i][j] + arr[j][i]);
                }
                if(!visited[i] && !visited[j]) {
                    link += (arr[i][j] + arr[j][i]);
                }
            }
        }

        return Math.abs(start - link);
    }
}
