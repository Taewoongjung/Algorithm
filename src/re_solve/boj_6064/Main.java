package re_solve.boj_6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        int L = Integer.parseInt(br.readLine());


        int result = 0;
        for (int i = 0; i < L; i++) {
            st=  new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (y > N) {
                y = 1;
            }

            if (x > M) {
                x = 1;
            }

            if (N == x && M == y) {
                System.out.println(result);
                result = 0;
                continue;
            }

            x++;
            y++;
            result++;
        }
    }
}
