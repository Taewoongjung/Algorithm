package code.plus.boj_15665;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static List<Integer> list;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N];
            selected = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Set<Integer> hashSet = new HashSet<>();
            for (int data : arr) {
                hashSet.add(data);
            }
            list = new ArrayList<>(hashSet);

            process(0);
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void process(int cnt) {
        if (cnt == M) {
            int x = 0;
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            selected[cnt] = list.get(i);
            process(cnt+1);
        }
    }
}
