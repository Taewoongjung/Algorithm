package bronze.boj_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = 0;
        result = A * B * C;

        String tmp = String.valueOf(result);
        int[] arr = new int[tmp.length()];

        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;

        for (int i = 0; i < tmp.length(); i++) {
            arr[i] = tmp.charAt(i) - '0';
            if (arr[i] == 0) {
                zero++;
            }
            if (arr[i] == 1) {
                one++;
            }
            if (arr[i] == 2) {
                two++;
            }
            if (arr[i] == 3) {
                three++;
            }
            if (arr[i] == 4) {
                four++;
            }
            if (arr[i] == 5) {
                five++;
            }
            if (arr[i] == 6) {
                six++;
            }
            if (arr[i] == 7) {
                seven++;
            }
            if (arr[i] == 8) {
                eight++;
            }
            if (arr[i] == 9) {
                nine++;
            }
        }

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }
}
