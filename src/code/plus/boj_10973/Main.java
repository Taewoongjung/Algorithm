package code.plus.boj_10973;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (prePermutation(arr)) {
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("-1");
        }
    }

    static public boolean prePermutation(int[] arr) {
        int a = arr.length - 1;
        while (a > 0 && arr[a - 1] < arr[a]) a--;

        if (a <= 0) {
            return false;
        }

        int b = arr.length - 1;
        while(arr[a - 1] < arr[b]) b--;

        int temp = arr[a - 1];
        arr[a - 1] = arr[b];
        arr[b] = temp;

        int end = a;
        int start = arr.length - 1;
        while (start > end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start--;
            end++;
        }
        return true;
    }
}
