package re_solve.boj_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int key[];
    static int value[];
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        key = new int[N];
        value = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            key[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        process(0, 0);
        System.out.println(max);
    }

    private static void process(int k, int v) {
        if (k > N) return;
        if (k == N) {
            max = Integer.max(max, v);
            return;
        }

        process(k + key[k], v + value[k]);
        process(k + 1, v);
    }
}
