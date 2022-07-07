package re_solve.boj_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = GCD(a, b);

        sb.append(gcd).append("\n"); // 최대공약수
        sb.append(a*b / gcd).append("\n"); // 최소공배수

        System.out.println(sb);
    }

    public static int GCD(int a, int b) {
        if(b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
