package main.boj_17427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        long fx[] = new long[1000001]; // 해당 자연수의 모든 약수를 더한 변수
        long dp[] = new long[1000001]; // 해당 자연수 이하의 모든 fx 값을 더한 변수

        // 1은 모든 수의 약수니까 전부 넣어준다.
        Arrays.fill(fx,1);

        /*
            i=2
            fx[2*1] += 2;
            fx[2*2] += 2;
            fx[2*3] += 2:
            ...
            fx[2*50만] += 2;

            i=3
            fx[3*1] += 3:
            fx[3*2] += 3;
            ...
            fx[3*333333] += 3;
            ...

            결국에는


            fx[1] = 1
            fx[2] = 1+2 = 3
            fx[3] = 1+3 = 4
            fx[4] = 1+2+4 = 7
            fx[5] = 1+5 = 6
            ....
            fx[100만] = 몰라


            이거를 만들어 가는 과정이다~


        */

        for (int i=2; i<fx.length; i++) {
            for (int j=1; i*j < fx.length; j++) {
                fx[i*j] += i;
            }
        }


        /*

            dp[1] = fx 1합
            dp[2] = fx 1, 2합
            dp[3] = fx 1,2,3합
            ...
            dp[7] = fx 1,2,3,4,5,6,7 합
            dp[8] = fx 1,2,3,4,5,6,7,8 합
            dp[9] = fx 1,2,3,4,5,6,7,8,9 합
            dp[10] = fx 1,2,3,4,5,6,7,8,9,10 합


            fx[1] = 1
            fx[2] = 1+2 = 3
            fx[3] = 1+3 = 4
            fx[4] = 1+2+4 = 7
            fx[5] = 1+5 = 6
            ....
            fx[100만] = 몰라

            dp[1] = 0 + fx[1] = 1
            dp[2] = fx[1]+fx[2] = dp[1] + fx[2] = 1 + 3 = 4
            dp[3] = fx[1]+fx[2]+fx[3] = dp[2] + fx[3] = 4 + 4 = 8
            dp[4] = fx[1]+fx[2]+fx[3]+fx[4] = dp[3] + fx[4] = 8 + 7  = 15
            ...
            dp[100만] = 몰라

        */
        for(int i=1; i<dp.length; i++) {
            dp[i] += dp[i-1] + fx[i];
        }

        while(t-- > 0) {
            int input = Integer.parseInt(br.readLine());

            sb.append(dp[input]).append("\n");
        }

        System.out.println(sb);
    }
}
