package tier.bronze.boj_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            String tmp = list.get(i);
            int cnt = 0;
            int tmp_cnt = 0;
            for (int j = 0; j < tmp.length(); j++) {
                char OorX = tmp.charAt(j);
                if (OorX == 'O') {
                    cnt++;
                    tmp_cnt += cnt;
                }
                if(OorX == 'X') {
                    cnt = 0;
                }
            }
            System.out.println(tmp_cnt);
        }
    }
}
