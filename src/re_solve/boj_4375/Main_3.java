package re_solve.boj_4375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String a = br.readLine();
            if (a == null) {
                break;
            }

            int N = Integer.parseInt(a);
            int num = 0;
            for (int i = 1; i <= N; i++) {
                num = num * 10 + 1;
                num %= N;
                if (num == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
