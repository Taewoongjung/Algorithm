package tier_resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Memo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int a = solution(4, 3, arr);
        System.out.println(a);
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m) {
            answer += score[i - m] *m;
        }

        return answer;
    }
}
