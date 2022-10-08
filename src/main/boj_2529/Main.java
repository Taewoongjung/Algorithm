package main.boj_2529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static char[] arr;
    static long[] tarr;
    static boolean[] visited;
    static long min = Long.MAX_VALUE;
    static long max = Long.MIN_VALUE;
    static String min_string = "";
    static String max_string = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N];
        tarr = new long[N + 1];
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
            boolean flag = true; //false가 되면 하나라도 만족하지 않음을 의미. true면 모든 조건 만족.
            String s = "";
            for (int i=0;i<tarr.length; i++) {
                s += Long.toString(tarr[i]);
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '<') {
                    if (tarr[i] < tarr[i+1]) ;
                    else flag = false;
                }
                else {
                    if (tarr[i] > tarr[i+1]) ;
                    else flag = false;
                }
            }
            if (flag) {
                if (min > Long.parseLong(s)) {
                    min = Long.parseLong((s));
                    min_string = s;
                }
                if (max < Long.parseLong((s))) {
                    max = Long.parseLong((s));
                    max_string = s;
                }
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!visited[i]) {
                visited[i] = true;
                tarr[depth] = i;
                back(depth + 1);
                visited[i] = false;
            }
        }
    }
}



/*
*
* package main.boj_2529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static char[] arr;
    static int[] tarr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static String min_string = "";
    static String max_string = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N];
        tarr = new int[N + 1];
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
            int cnt = 0;
            String s = "";
            for (int i=0;i<tarr.length; i++) {
                s += Integer.toString(tarr[i]);
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '<') {
                    if (tarr[i] < tarr[i+1]) cnt++;
                }
                else {
                    if (tarr[i] > tarr[i+1]) cnt++;
                }
            }
            if (cnt == arr.length) {
                if (min > Integer.parseInt(s)) {
                    min = Integer.parseInt(s);
                    min_string = s;
                }
                if (max < Integer.parseInt(s)) {
                    max = Integer.parseInt(s);
                    max_string = s;
                }
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!visited[i]) {
                visited[i] = true;
                tarr[depth] = i;
                back(depth + 1);
                visited[i] = false;
            }
        }
    }
}

* */
