package re_solve.boj_4375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
            int Num = Integer.parseInt(s);
            int num = 0;
            for (int i = 1; i <= Num; i++) {
                num = num * 10 + 1;
                num %= Num;
                if ( num == 0) {
                    break;
                }
            }
        }
    }
}
