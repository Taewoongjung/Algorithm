package re_solve.boj_17427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += (N / i) * i;
        }
        System.out.println(sum);
    }
}
