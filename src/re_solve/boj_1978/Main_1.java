package re_solve.boj_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) {
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                continue;
            }
            System.out.println(Math.sqrt(num));

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if ( num % i  == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}
