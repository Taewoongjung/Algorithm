package tier_resolve.silver.boj_1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = d(N);
        System.out.println(result);
    }

    public static int d(int num) {
        int result = 0;
        if (num < 100) {
            return num;
        }
        else {
            result = 99;

            for (int i = 100; i <= num; i++) {
                int hun = i / 100;
                int ten = (i /10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    result++;
                }
            }

            return result;
        }
    }

}
