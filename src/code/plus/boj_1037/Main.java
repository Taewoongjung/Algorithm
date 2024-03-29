package code.plus.boj_1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        List<Integer> list = new ArrayList<>();

        while(T-- > 0) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        int max = list.get(list.size()-1);
        int min = list.get(0);

        System.out.println(max * min);
    }
}
