package tier.bronze.boj_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int new_A;
        int new_B;
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i >= 0; i--) {
            sb.append(A.charAt(i));
        }
        new_A = Integer.parseInt(String.valueOf(sb));

        StringBuilder sba = new StringBuilder();
        for (int i = 2; i >= 0; i--) {
            sba.append(B.charAt(i));
        }
        new_B = Integer.parseInt(String.valueOf(sba));

        int max = 0;
        if (new_A > new_B) {
            max = new_A;
        } else {
            max = new_B;
        }

        System.out.println(max);
    }

}
