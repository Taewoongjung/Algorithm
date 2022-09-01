package re_solve.boj_1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        boolean[] isBroken = new boolean[10];

        if (m != 0) {
            st = new StringTokenizer(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            int brokenBtn = Integer.parseInt(st.nextToken());
            isBroken[brokenBtn] = true;
        }

        if (n == 100) {
            System.out.println(0);
            return;
        }

        int ans = Math.abs(n - 100);
        for (int i = 0; i < 1000000; i++) {
            String channel = String.valueOf(i); // 자릿수 하나 하나 확인 하기 위해서 charAt 을 사용 하기 위해 String 으로 받았다.

            boolean isPossible = true;
            for (int j = 0; j < channel.length(); j++) {
                int it = channel.charAt(j) - '0';

                if (isBroken[it]) {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                int cnt = channel.length() + Math.abs(i - n);
                ans = Math.min(cnt, ans);
            }
        }
        System.out.println(ans);
    }
}
