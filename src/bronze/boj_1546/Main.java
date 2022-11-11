package bronze.boj_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            result += input;
            list.add(input);
        }
        Collections.sort(list);

        double peek = list.get(N - 1);

        double cal = (result / peek) * 100;

        System.out.println(cal / N);
    }
}
