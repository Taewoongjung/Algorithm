package re_solve.boj_6603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            if (N == 0) break;

            arr = new int[N];
            visited = new boolean[N];

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            back(0, 0);
            System.out.println();
        }
    }

    public static void back(int depth, int start) {
        if (depth == 6) {
            for (int i = 0; i < N; i++) {
                if (visited[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                back(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}
