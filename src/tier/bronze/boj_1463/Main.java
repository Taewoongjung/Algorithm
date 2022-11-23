package tier.bronze.boj_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        System.out.println(process(X, 0));
    }

    public static int process(int x, int cnt) {
        if (x < 2) {
            return cnt;
        }

        return Math.min(process(x / 2, cnt + 1 + (x % 2)), process(x / 3, cnt + 1 + (x % 3)));
    }
}
