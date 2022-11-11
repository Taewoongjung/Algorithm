package code.plus.boj_3085;

import java.util.Scanner;

public class Main {
    static int check(char[][] a) {
        int n = a.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int cnt = 1; // 카운트를 1 로 초기화
            for (int j = 1; j < n; j++) { // ** 가로 검사 **
                if (a[i][j] == a[i][j - 1]) { // 오른쪽에 있는 사탕이랑 비교해서 같다면
                    cnt += 1; // 카운트 + 1
                } else {
                    cnt = 1; // 아니면 1로 초기화
                }
                if (ans < cnt) // 카운트가 ans 보다 크다면
                    ans = cnt; // ans 에 카운트를 할당
            }
            cnt = 1; // 카운트를 1 로 초기화
            for (int j = 1; j < n; j++) { // ** 세로 검사 **
                if (a[j][i] == a[j - 1][i]) {
                    cnt += 1;
                } else {
                    cnt = 1;
                }
                if (ans < cnt)
                    ans = cnt;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().toCharArray(); // toCharArray 은 문자열을 char 형 배열로 바꿔준다.
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 < n) { // 가로 검사
                    char t = a[i][j]; // 옆에 사탕을 검사 하기 위해서 옆에와 바꾸는 작업
                    a[i][j] = a[i][j + 1];
                    a[i][j + 1] = t;
                    int temp = check(a);
                    if (ans < temp) // count 를 제일 큰걸로 업데이트 하기 위함
                        ans = temp;
                    t = a[i][j]; // 다시 바꾸는 작업 (원상복구)
                    a[i][j] = a[i][j + 1];
                    a[i][j + 1] = t;
                }
                if (i + 1 < n) { // 세로 검사
                    char t = a[i][j]; // 밑에 사탕을 검사 하기 위해서 밑에 사탕과 바꾸는 작업
                    a[i][j] = a[i + 1][j];
                    a[i + 1][j] = t;
                    int temp = check(a);
                    if (ans < temp) // count 를 제일 큰걸로 업데이트 하기 위함
                        ans = temp;
                    t = a[i][j]; // 다시 바꾸는 작업 (원상복구)
                    a[i][j] = a[i + 1][j];
                    a[i + 1][j] = t;
                }
            }
        }
        System.out.println(ans);
    }
}
