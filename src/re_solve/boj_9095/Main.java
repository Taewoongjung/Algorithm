package re_solve.boj_9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[11];

            /*
                0 : 0
                1 : 1 (1)
                2 : 2 (1+1, 2)
                3 : 4 (1+1+1, 1+2, 2+1, 3)
                4 : 7 (1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1)
                                    .
                                    .
                                    .
            */

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
                /*
                    dp[4] : dp[3] + dp[2] + dp[1]
                    dp[5] : dp[4] + dp[3] + dp[2]
                    dp[6] : dp[5] + dp[4] + dp[3]
                    dp[7] : dp[6] + dp[5] + dp[4]
                */
            }
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
    }
}
