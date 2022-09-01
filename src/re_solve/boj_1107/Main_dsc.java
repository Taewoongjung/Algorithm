package re_solve.boj_1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
경우의수1.    현재 주어진 100번에서  n번까지  +/-만 이요해서 가는 경우

경우의수2.    0부터 1000000까지를   부서지지않은 숫자버튼만 눌러서 일단 간 다음에,   거기서  +/-를 사용해서  n번까지 가는경우



* */


public class Main_dsc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine()); // 목표 채널
        int m = Integer.parseInt(br.readLine()); // 망가진 버튼 수
        boolean[] isBoroken = new boolean[10]; // 버튼 고장 여부

        if (m != 0) {
            st = new StringTokenizer(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            int brokenBtn = Integer.parseInt(st.nextToken());
            isBoroken[brokenBtn] = true;
        }

        if (n == 100) {
            System.out.println(0);
            return;
        }

        int ans = Math.abs(n - 100); // 경우의 수 1 =  +나 -버튼만 써서 가는 경우
        for (int i = 0; i <= 1000000; i++) {  // 경우의 수 2
            // 100만 까지의 채널을 돌면서 최소로 리모컨을 작동 시켜서 원하는 채널로 가기 위함을 확인는 루프

            String strChan = String.valueOf(i); // 숫자 i 를 String 으로 바꿔서 charAt 으로 자릿수 하나 하나 확인 하기 위함

            boolean isPossible = true; // strCan 에 들어간 채널이 숫자 로만 갈 수 있는 숫자일 때 isPossible 이 true 가 나온다.
            for (int j = 0; j < strChan.length(); j++) { // strChan 의 자릿수 하나 하나 확인 해서 부서진 버튼 인지 확인 하는 루프
                int btn = strChan.charAt(j) - '0'; // 부서진 버튼이 있는지 없는지 검사
                if (isBoroken[btn]) { // 부서진 버튼 이면
                    isPossible = false; // isPossible 은 false
                    break; // 그리고 더 이상 계산할 필요 없으니 for j 루프를 빠져 나와서 다음 strChan 을 검사 한다.
                }
            }

            if (isPossible) { // 만약 isPossible 이 true 면
                int cnt = strChan.length() + Math.abs(i - n); // cnt 에 assign 되는 것들이 두 가지로 나뉘 는데

                /*
                    strChan.length()      <------ strChan 의 길이 만큼 리모컨의 번호로 채널 이동 하는 횟수

                     Math.abs(i - n)      <------ 현재 확인 한 채널과 가고자 한 채널을 빼고 절대 값이다. 오로지 +,- 버튼 으로 갈 수 있는 횟수를 의미함
                */

                ans = Math.min(ans, cnt); // 기존에 현재 시청 중인 100번 채널과 가고자 하는 채널 n 을 뺀 결과와 위 cnt를 비교 해서 최소 값이 ans 로 담긴다.
            }
        }
        System.out.println(ans); // 결국엔 최소로 움직이는 값이 답이 된다.
    }
}
