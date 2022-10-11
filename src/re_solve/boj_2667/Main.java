package re_solve.boj_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[][] visited;
    static int[][] color;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];
        color = new int[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = input.charAt(j) - '0';
            }
        }

        int component_cnt = 0;   // 단지 갯수
        int dir_x[] = {0, 0, 1, -1}; // 동 서 남 북
        int dir_y[] = {1, -1, 0, 0}; // 동 서 남 북

        // dfs 시작
        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0) continue;
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    color[i][j] = ++component_cnt;
                    q.offer(new Pair(i, j));

                    while (!q.isEmpty()) {
                        Pair cur = q.poll();
                        int cur_x = cur.getFirst();
                        int cur_y = cur.getSecond();

                        for (int k = 0; k < 4; k++) {
                            int next_x = dir_x[k] + cur_x;
                            int next_y = dir_y[k] + cur_y;

                            if (next_x < 0 || next_x >= N || next_y >= N || next_y < 0) continue;
                            if(arr[next_x][next_y] == 0) continue;

                            if (!visited[next_x][next_y]) {
                                visited[next_x][next_y] = true;
                                color[next_x][next_y] = component_cnt;
                                q.offer(new Pair(next_x, next_y));
                            }
                        }
                    }
                }
            }
        }

        int[] house_cnt = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < N + 1; j++) {
                if (visited[i][j]) {
                    house_cnt[color[i][j]]++;
                }
            }
        }

        System.out.println(component_cnt);
        for (int i = 1; i <= component_cnt; i++) {
            System.out.println(house_cnt[i]);
        }
    }
}

class Pair {
    private final int x;
    private final int y;

    public Pair(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getFirst() {
        return this.x;
    }

    public int getSecond() {
        return this.y;
    }
}