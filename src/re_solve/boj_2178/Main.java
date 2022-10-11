package re_solve.boj_2178;

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
    static boolean[][] visited;
    static int[][] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = temp.charAt(j) -'0';
            }
        }


        int[] dir_x = {0, 0, 1, -1};
        int[] dir_y = {1, -1, 0, 0};

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, 0));
        visited[0][0] = true;
        dist[0][0] = 0;
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int cur_x = cur.getFirst();
            int cur_y = cur.getSecond();

            for (int k = 0; k < 4; k++) {
                int next_x = dir_x[k] + cur_x;
                int next_y = dir_y[k] + cur_y;

                if (next_x < 0 || next_x >= N || next_y < 0 || next_y >= M) continue;
                if(arr[next_x][next_y] == 0) continue;

                if (!visited[next_x][next_y]) {
                    visited[next_x][next_y] = true;
                    dist[next_x][next_y] = dist[cur_x][cur_y] + 1;
                    q.offer(new Pair(next_x, next_y));
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(dist[N-1][M-1]+1);
    }
}

class Pair {
    private int first;
    private int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst(){
        return first;
    }

    public int getSecond(){
        return second;
    }
}