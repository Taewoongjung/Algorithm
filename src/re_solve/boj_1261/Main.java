package re_solve.boj_1261;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] visited;

    static int[] dir_x = {0, 0, 1, -1};
    static int[] dir_y = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }
        }

        PriorityQueue<Pair> q = new PriorityQueue<Pair>();
        q.offer(new Pair(0, 0, 0));
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int cur_x = cur.getFirst();
            int cur_y = cur.getSecond();
            int cur_cnt = cur.getCnt();

            if (cur_x == N - 1 && cur_y == M - 1) {
                System.out.println(cur_cnt);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int next_x = dir_x[i] + cur_x;
                int next_y = dir_y[i] + cur_y;

                if (next_x < 0 || next_x >= N || next_y < 0 || next_y >= M) continue;

                if (!visited[next_x][next_y]) {
                    if (arr[next_x][next_y] == 0) {
                        q.offer(new Pair(next_x, next_y, cur_cnt));
                    }
                    else if (arr[next_x][next_y] == 1) {
                        q.offer(new Pair(next_x, next_y, cur_cnt + 1));
                    }
                    visited[next_x][next_y] = true;
                }
            }
        }
    }
}

class Pair implements Comparable<Pair> {
    private final int x;
    private final int y;
    private final int cnt;

    public Pair(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }

    public int getFirst() {
        return x;
    }

    public int getSecond() {
        return y;
    }

    public int getCnt() {
        return cnt;
    }

    @Override
    public int compareTo(Pair o) {
        return this.cnt - o.cnt;
    }
}