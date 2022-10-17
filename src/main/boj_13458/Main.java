package main.boj_13458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int A;
    static int B;
    static int C;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        long result = 0; // 필요한 총 감독관 수
        for (int i = 0; i < N; i++) {
            long remainder = arr[i]; // 처리해야하는 잔여 학생 수
            remainder -= B; //총 감독관 1명이 B명을 처리함
            result += 1; //총 감독관 1명을 추가했다는 의미

            if (remainder > 0) {
                long sub_referee_cnt = (remainder + C-1) / C;

                result += sub_referee_cnt;
            }

//            while (true) {
//                if (remainder <= 0) break;
//                remainder -= C; //부감독관 1명이 C명을 처리함
//                result += 1; //부감독관 1명을 추가했다는 의미
//            }
        }
        System.out.println(result);
    }
}
