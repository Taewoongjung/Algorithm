package re_solve.boj_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main_1 {
    static int N;
    static int[][] arr;
    static int[][] color;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        color = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }
        }

        int component_cnt = 0;
        int[] dir_x = {0, 0, 1, -1};
        int[] dir_y = {1, -1, 0, 0};

        // bfs 시작
        Queue<Pair1> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0) continue;
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    color[i][j] = ++component_cnt;
                    q.offer(new Pair1(i, j));

                    while (!q.isEmpty()) {
                        Pair1 temp = q.poll();
                        int x = temp.getFirst();
                        int y = temp.getSecond();

                        for (int k = 0; k < 4; k++) {
                            int next_x = dir_x[k] + x;
                            int next_y = dir_y[k] + y;

                            if(next_x < 0 || next_x >= N || next_y < 0 || next_y >= N) continue;
                            if(arr[next_x][next_y] == 0) continue;

                            if (!visited[next_x][next_y]) {
                                visited[next_x][next_y] = true;
                                color[next_x][next_y] = component_cnt;
                                q.offer(new Pair1(next_x, next_y));
                            }
                        }
                    }
                }
            }
        }

        int [] house_cnt = new int[component_cnt + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j]) {
                    house_cnt[color[i][j]]++;
                }
            }
        }

        System.out.println(component_cnt); // 단지 갯수
        Arrays.sort(house_cnt); // house_cnt[0,1,2,3] = [0,9,8,7]  -> sort  ->   [0,7,8,9]
        for (int i = 1; i <= component_cnt; i++) {
            System.out.println(house_cnt[i]);
        }
    }
}

class Pair1 {
    private final int x;
    private final int y;

    public Pair1(final int x, final int y) {
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