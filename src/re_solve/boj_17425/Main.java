package re_solve.boj_17425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            long sum = 0;
            for (int j = 1; j <= arr[i]; j++) {
                sum += (arr[i] / j) * j;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
