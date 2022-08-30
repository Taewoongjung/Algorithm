package re_solve.boj_4375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1_dsc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = br.readLine();
            if (s == null) break;

            int N = Integer.parseInt(s); // 입력 받기
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
        /*
        * num = num * 10 + 1 을 하면서
        * 나누어 떨어지면 그 자리수를 출력한다.
        * */
    }
}
