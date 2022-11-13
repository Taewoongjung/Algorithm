package tier.bronze.boj_2675;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                for (int k = 0; k < num; k++) {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
