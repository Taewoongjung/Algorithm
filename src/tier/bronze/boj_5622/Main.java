package tier.bronze.boj_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpha = br.readLine();

        int result = 0;
        for (int i = 0; i < alpha.length(); i++) {
            char temp = alpha.charAt(i);
            if (temp == 'A' || temp == 'B' || temp == 'C') {
                result += 3;
            }
            if (temp == 'D' || temp == 'E' || temp == 'F') {
                result += 4;
            }
            if (temp == 'G' || temp == 'H' || temp == 'I') {
                result += 5;
            }
            if (temp == 'J' || temp == 'K' || temp == 'L') {
                result += 6;
            }
            if (temp == 'M' || temp == 'N' || temp == 'O') {
                result += 7;
            }
            if (temp == 'P' || temp == 'Q' || temp == 'R' || temp == 'S') {
                result += 8;
            }
            if (temp == 'T' || temp == 'U' || temp == 'V') {
                result += 9;
            }
            if (temp == 'W' || temp == 'X' || temp == 'Y' || temp == 'Z') {
                result += 10;
            }
        }
        System.out.println(result);
    }
}
