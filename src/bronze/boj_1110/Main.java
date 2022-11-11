package bronze.boj_1110;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine()); // 입력 받기

        int res = 0;

        int A = input;

        while (true) {
            res++;
            A = (A % 10) * 10 + (A / 10 + A % 10) % 10;
            if (input == A) {
                break;
            }
        }

        System.out.println(res);
    }
}
