package code.plus.boj_2178;

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
        visited = new boolean[N][M]; //각 정점을 방문했는지 여부
        dist = new int[N][M]; // (0,0)에서 (i,j)까지의 이동거리
        for (int i = 0; i <= N-1; i++) {
            String temp = br.readLine();
            for (int j=0; j <= M-1; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }
        }

        int qx[] = {0, 0, 1, -1};
        int qy[] = {1, -1, 0, 0};
        // BFS 시작
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, 0));
        visited[0][0] = true;
        dist[0][0] = 0; // (0,0) -> (0,0): distance 0
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int cur_x = cur.getFirst();
            int cur_y = cur.getSecond();
            // cur 정점에서 4방향 탐색
            for (int k = 0; k < 4; k++) {
                int next_x = cur_x + qx[k];
                int next_y = cur_y + qy[k];
                if (next_x < 0 || next_x >= N || next_y < 0 || next_y >= M) continue; // 지도 밖으로 벗어나는 경우
                if (arr[next_x][next_y] == 0) continue; // 갈 수 없는 곳이면 continue
                if (!visited[next_x][next_y]) { // 이 때까지 방문 안했으면
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
        System.out.println(dist[N-1][M-1] + 1);
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