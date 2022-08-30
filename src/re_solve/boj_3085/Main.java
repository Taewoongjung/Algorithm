package re_solve.boj_3085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        가로나 세로나 바꾼 다음 배열을 매개 변수로 받고
        먹을 수 있는 연속된 사탕중에 제일 긴 사탕인지 검사하는 메소드
    */
    static int check(char[][] arr) {
        int n = arr.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == arr[i][j - 1]) { // 가로로 비교하는 로직
                    cnt += 1;
                } else { // 이게 왜 필요하지? 같지 않으면 위에서 +1을 안할건데.
                    cnt = 1;
                }
                if (ans < cnt) {
                    ans = cnt;
                }
            }
            cnt = 1; // 세로로 검사를 하기 위해 카운트를 1로 초기화
            for (int j = 1; j < n; j++) {
                if (arr[j][i] == arr[j - 1][i]) {
                    cnt += 1;
                } else {
                    cnt = 1;
                }
                if (ans < cnt) {
                    ans = cnt;
                }
            }
        }
        return ans; // 사탕의 최대값을 반환
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 < n) { // 가로 검사
                    char t = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = t;
                    int temp = check(arr);
                    if (ans < temp) { // check 함수에서 반환된 최대값이 더 크면 "ans"에 할당
                        ans = temp;
                    }
                    // 바꿨던 것을 원상복구 하는 작업
                    t = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = t;
                }
                if (i + 1 < n) { // 세로 검사
                    char t = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = t;
                    int temp = check(arr);
                    if (ans < temp) {
                        ans = temp;
                    }
                    t = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = t;
                }
            }
        }
        System.out.println(ans);
    }
}
