package tier.bronze.boj_4344;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int NUM = Integer.parseInt(st.nextToken());
            int[] arr = new int[NUM];

            double cal_avg = 0;
            double result_avg = 0;

            for (int j = 0; j < NUM; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                cal_avg += arr[j];
            }

            result_avg = cal_avg / NUM; // 평균 계산
            double finalResult_avg = result_avg;

            long count = Arrays.stream(arr).filter((h) -> h > finalResult_avg).count();

            double result = (double) count/NUM * 100;

            sb.append(String.format("%.3f", result)+"%").append("\n");

        }
        System.out.println(sb);
    }
}
