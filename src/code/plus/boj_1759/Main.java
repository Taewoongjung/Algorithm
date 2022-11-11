package code.plus.boj_1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int L, C;
    static char alpa[], sel[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken()); // 암호 자리수
        C = Integer.parseInt(st.nextToken()); // 사용했을 법한 문자의 종류

        alpa = new char[C];
        sel = new char[L];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            alpa[i] = st.nextToken().charAt(0);
        }

        // 정렬된 문자를 선호하는 조교들 이기에 sort 함
        Arrays.sort(alpa);

        process(0, 0, 0, 0);
        System.out.println(sb);
    }

    // 최소 한 개의 모음과 최소 두 개의 자음으로 구성
    private static void process(int idx, int cnt, int v, int c) {
        if (cnt == L) { // cnt가 자리수(L)랑 같다면 (= 자리수를 충족했다면 )
            if (v >= 1 && c >= 2) { // 최소 1개의 모음과 최소 2개의 자음이면
                for (int i = 0; i < L; i++) { // 자리수 만큼 for문 돌면서
                    sb.append(sel[i]); // sel 배열에 있는 것들 출력
                }
                sb.append("\n");
            }
            return;
        }

        for (int i = idx; i < C; i++) { // 알파벳 갯수 만큼 for문 돈다.
            sel[cnt] = alpa[i]; // 해당 알파벳을 sel 배열에 넣는다.

            if (alpa[i] == 'a' || alpa[i] == 'e' || alpa[i] == 'i' || alpa[i] == 'o' || alpa[i] == 'u')
                process(i + 1, cnt + 1, v + 1, c); // 모음이면 v가 +1 이 되고
            else
                process(i + 1, cnt + 1, v, c + 1); // 자음이면 c가 +1 이 된다.
        }
    }
}
