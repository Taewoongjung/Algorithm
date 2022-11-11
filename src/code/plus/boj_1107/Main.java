package code.plus.boj_1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine()); // 목표 채널
        int m = Integer.parseInt(br.readLine()); // 망가진 버튼 수
        boolean[] isBroken = new boolean[10]; // 버튼 고장 여부

        if (m != 0) {
            st = new StringTokenizer(br.readLine());
        }
        for(int i = 0; i < m; i++) {
            int brokenBtn = Integer.parseInt(st.nextToken());
            isBroken[brokenBtn] = true;
        }

        if (n == 100) {
            System.out.println(0);
            return;
        }

        int ans = Math.abs(n - 100); // 현재 시청중인 채널이 100번 채널 이라서 100을 빼준다.
        for (int i = 0; i <= 1000000; i++) { // 가고자 하는 채널까지 계속 루프 돌면서
            String strChan = String.valueOf(i);
            /*
            * 가고자 하는 채널을 strChan 변수에 넣고
            * 루프를 돌면서 밑에 "111" 이라고 표시 되어 있는 루프를 돌면서
            * 리모컨 으로 한번에 갈 수 있는지 검사 한다.
            * */

            boolean isPossible = true;
            for(int j = 0; j < strChan.length(); j++) { // 111
                int btn = strChan.charAt(j) - '0'; // strChan 에 123 채널을 검사 하고 싶을 때 버튼 1, 2, 3 을 사용할 수 있는지 검사한다.
                if (isBroken[btn]) {
                    isPossible = false;
                    break;
                }
            }

            if(isPossible) { // 리모컨 으로 한번에 채널을 옮길 수 있다면
                int cnt = strChan.length() + Math.abs(i - n); // 숫자 이동 후 +,- 이동
                ans = Math.min(ans, cnt);
            }
        }
        System.out.println(ans);
    }
}
