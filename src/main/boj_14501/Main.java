package main.boj_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] k;
    static int[] v;
    static int N;
    static int money = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        k = new int[N];
        v = new int[N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            k[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        process(0, 0);
        System.out.println(money);
    }

    public static void process(int key, int value) {

        if (key > N) return;
        if (key == N) {
            money = Math.max(money, value);
            return;
        }

        process(key + k[key], value + v[key]);
        process(key + 1, value);
    }
}
