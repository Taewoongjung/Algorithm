package tier.silver.boj_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            boolean[] arr = new boolean[26];
            int prev = 0;

            boolean flag = true;
            for (int j = 0; j < tmp.length(); j++) {
                int now = tmp.charAt(j);

                if (now != prev) {
                    if (!arr[tmp.charAt(j) - 'a']) {
                        arr[tmp.charAt(j) - 'a'] = true;
                        prev = now;
                    }
                    else {
                        flag = false;
                    }
                }
            }
            if (flag) {
                result++;
                flag = false;
            }
        }
        System.out.println(result);
    }
}
