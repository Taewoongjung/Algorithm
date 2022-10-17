package main.boj_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static int[] max_cnt;
    static int[] cur_cnt;
    static int[] sequence;
    static int sum_of_max_cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        max_cnt = new int[N]; //max_cnt[i]: 숫자 i를 최대 몇 개 사용할 수 있는지.
        cur_cnt = new int[N]; //cur_cnt[i]: 현재, 숫자 i를 몇 개 뽑았는 지 저장

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            max_cnt[i] = Integer.parseInt(st.nextToken());
            sum_of_max_cnt += max_cnt[i]; // max_cnt[]=[2,1,1,1]이면 그 합인 2+1+1+1=5가 담김
        }

        sequence = new int[sum_of_max_cnt]; //크기가 5인 배열을 담을 것임. (1 1 2 3 4) (1 1 2 4 3) ... (4 3 2 1 1)

        back(0);
    }

    public static void back(int depth) {
        if (depth == sum_of_max_cnt) { // 다 뽑았으니까 출력
            for (int i=0; i<sum_of_max_cnt; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < 4; i++) {
            // 숫자 i는 max_cnt[i]개만큼만 뽑을 수 있는데, cur_cnt[i]가 max_cnt[i]보다 작아야만 하나를 더 선택할 수 있음
            if (cur_cnt[i] < max_cnt[i]) {
                sequence[depth] = i; //현재 턴에서 선택한 숫자는 i이다.
                cur_cnt[i]++; //i를 하나 선택했으니까 cur_cnt[i]를 증가시킴
                back(depth + 1); // 다음 depth로 이동
                cur_cnt[i]--; //dfs를 하고 돌아왔으므로 cur_cnt를 원상복구시킴(감소시킴)
            }
        }
    }
}
