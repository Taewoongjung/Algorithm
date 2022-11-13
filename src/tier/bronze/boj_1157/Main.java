package tier.bronze.boj_1157;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        String str = br.readLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            arr[ch - 'a']++;
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A');
            } else if(arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
