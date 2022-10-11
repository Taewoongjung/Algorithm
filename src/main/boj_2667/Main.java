package main.boj_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        visited = new boolean[N][N]; //각 정점을 방문했는지 여부
        color = new int[N][N]; //각 정점(i, j)의 단지 번호
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }
        }

        int component_cnt = 0; // 단지 갯수(컴포넌트 갯수)
        int qx[] = {0, 0, 1, -1};
        int qy[] = {1, -1, 0, 0};
        // BFS 시작
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0) continue; // 단지의 시작점인(i,j)가 갈 수 없는 곳(0)이면 continue
                if (!visited[i][j]) {
                    //BFS 시작
                    visited[i][j] = true;
                    component_cnt++;
                    color[i][j] = component_cnt; // 컴포넌트(구간)의 숫자를 넣는다.

                    System.out.println("push: " + i + ", " + j);
                    q.offer(new Pair(i, j));

                    System.out.println(component_cnt + "번째 bfs start");
                    while (!q.isEmpty()) {
                        Pair cur = q.poll();
                        int cur_x = cur.getFirst();
                        int cur_y = cur.getSecond();

                        System.out.println("pop: " + cur_x + ", " + cur_y);

                        // cur 정점에서 4방향 탐색
                        for (int k = 0; k < 4; k++) {   // k=0,      1,     2,     3
                            int next_x = cur_x + qx[k]; // 동:0+0, 서:0+0, 남:0+1, 북:0-1
                            int next_y = cur_y + qy[k]; // 동:1+1, 서:1-1, 남:1+0, 북:1+0
                            if (next_x < 0 || next_x >= N || next_y < 0 || next_y >= N) continue; // 지도 밖으로 벗어나는 경우
                            if (arr[next_x][next_y] == 0) continue; // 갈 수 없는 곳이면 continue
                            if (!visited[next_x][next_y]) { // 이때까지 방문 안했으면
                                visited[next_x][next_y] = true;
                                color[next_x][next_y] = component_cnt;
                                System.out.println("push: " + next_x + ", " + next_y); // q push
                                q.offer(new Pair(next_x, next_y));
                            }
                        }
                    }
                    // bfs 끝
                }
            }
        }

        // 각 단지 별로 몇 개의 집이 있는지를 카운팅 해야함
        int [] house_cnt = new int[component_cnt + 1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < N + 1; j++) {
                if (visited[i][j]) { // 방문을 한 정점이면
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