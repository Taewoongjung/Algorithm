package code.plus.boj_7562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int TEST_CASE;
    static int I;
    static int N;
    static int M;
    static int[][] chess_table;
    static boolean[][] visited;
    static int min = Integer.MAX_VALUE;
    static int[] dir_x = {-1, 1, -2, 2, -2, -1, 1, 2};
    static int[] dir_y = {-2, -2, -1, -1, 1, 2, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TEST_CASE = Integer.parseInt(br.readLine());

        for (int i = 0; i < TEST_CASE; i++) {
            min = 0;
            I = Integer.parseInt(br.readLine());

            chess_table = new int[I][I];
            visited = new boolean[I][I];

            Queue<Pair> q = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());

            // 시작지 입력
            int start_x = Integer.parseInt(st.nextToken());
            int start_y = Integer.parseInt(st.nextToken());

            visited[start_x][start_y] = true;
            q.offer(new Pair(start_x, start_y, 0)); // 현재 위치 큐에 넣기

            st = new StringTokenizer(br.readLine());
            // 도착지 입력
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            while (!q.isEmpty()) {
                Pair cur = q.poll();
                int cur_x = cur.getFirst();
                int cur_y = cur.getSecond();
                int resultCnt = cur.getResult_cnt();
                visited[cur_x][cur_y] = true;

                if (cur_x == N && cur_y == M) {
                    System.out.println(cur.getResult_cnt());
                    break;
                }

                for (int j = 0; j < 8; j++) {
                    int next_x = dir_x[j] + cur_x;
                    int next_y = dir_y[j] + cur_y;

                    if (next_x < 0 || next_x >= I || next_y < 0 || next_y >= I) continue;
                    if (!visited[next_x][next_y]) {
                        visited[next_x][next_y] = true;
                        q.offer(new Pair(next_x, next_y, resultCnt + 1));
                    }
                }
            }
        }
    }
}

class Pair {
    private final int x;
    private final int y;
    private final int result_cnt;

    public Pair(int x, int y, int result_cnt) {
        this.x = x;
        this.y = y;
        this.result_cnt = result_cnt;
    }

    public int getFirst() {
        return this.x;
    }

    public int getSecond() {
        return this.y;
    }

    public int getResult_cnt() {
        return result_cnt;
    }
}
