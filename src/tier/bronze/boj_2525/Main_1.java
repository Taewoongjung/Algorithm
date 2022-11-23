package tier.bronze.boj_2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        int hourToMin = 60 * h + m;
        hourToMin += N;

        int hour = (hourToMin / 60) % 24;
        int minute = hourToMin % 60;

        System.out.println(hour + " " + minute);
    }

}
