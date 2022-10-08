package re_solve.boj_2529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static char[] arr;
    static long[] tempArr;
    static boolean[] visited;
    static long min = Long.MAX_VALUE;
    static long max = Long.MIN_VALUE;
    static String min_string = "";
    static String max_string = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N];
        tempArr = new long[N + 1];
        visited = new boolean[10];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        back(0);
        System.out.println(max_string);
        System.out.println(min_string);
    }

    public static void back(int depth) {
        if (depth == arr.length + 1) {
            boolean flag = true;
            String s = "";
            for (int i = 0; i < tempArr.length; i++) {
                s += Long.toString(tempArr[i]);
            }
            for (int i = 0; i < N; i++) {
                if (arr[i] == '<') {
                    if (tempArr[i] < tempArr[i + 1]) ;
                    else flag = false;
                } else {
                    if (tempArr[i] > tempArr[i + 1]) ;
                    else flag = false;
                }
            }

            if (flag) {
                if (min > Long.parseLong(s)) {
                    min = Long.parseLong(s);
                    min_string = s;
                }
                if (max < Long.parseLong(s)) {
                    max = Long.parseLong(s);
                    max_string = s;
                }
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!visited[i]) {
                visited[i] = true;
                tempArr[depth] = i;
                back(depth + 1);
                visited[i] = false;
            }
        }
    }
}
