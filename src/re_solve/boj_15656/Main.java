package re_solve.boj_15656;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static int[] selected;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N];
            selected = new int[M];
            visited = new boolean[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            process(0);
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void process(int cnt) {
        System.out.println("SECOND = " + cnt);
        if (cnt == M) {
            System.out.println("IN = " + cnt);
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            System.out.println("===== RETURN =====");
            return;
        }

        for (int i = 0; i < N; i++) {
            System.out.println("i = " + i);
            System.out.println("cnt = " + cnt);
            selected[cnt] = arr[i];
            System.out.println("result = " + "selected" + "[" + cnt + "]" + " <= " + "arr" + "[" + i +"]"+"(" + arr[i] +")" );
            System.out.println("-------------------");
            process(cnt + 1);
        }
    }
}
