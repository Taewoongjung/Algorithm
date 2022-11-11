package code.plus.boj_7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[][] arr;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    q.offer(new Pair(i, j));
                }
            }
        }

        int[] dir_x = {0, 0, 1, -1};
        int[] dir_y = {1, -1, 0, 0};

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int cur_x = cur.getFirst();
            int cur_y = cur.getSecond();

            for (int i = 0; i < 4; i++) {
                int next_x = dir_x[i] + cur_x;
                int next_y = dir_y[i] + cur_y;

                if (next_x < 0 || next_x > N-1 || next_y < 0 || next_y > M -1) continue;
                if(arr[next_x][next_y] != 0) continue;

                arr[next_x][next_y] = arr[cur_x][cur_y] + 1;
                q.offer(new Pair(next_x, next_y));
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    System.out.println(-1);
                    System.exit(0);
                }
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max - 1);
    }
}

class Pair {
    private final int x;
    private final int y;

    public Pair(int x, int y) {
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
