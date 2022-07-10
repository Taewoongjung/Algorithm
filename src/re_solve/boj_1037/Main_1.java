package re_solve.boj_1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        while (N-- > 0) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        int max = list.get(list.size() -1);
        int min = list.get(0);

        System.out.println(max * min);
    }
}
