package tier.bronze.boj_2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        int cal = 0;
        cal = m + N;
        if (cal >= 60) {
            int tmp = cal;
            tmp = tmp / 60;
            h = h + tmp;
            m = cal - (60 * tmp);
        } else {
            m += N;
        }
        if (h >= 24) {
            h -= 24;
        }

        System.out.println(h + " " + m);
    }

}
