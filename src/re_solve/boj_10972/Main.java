package re_solve.boj_10972;

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

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (nextPermutation(arr)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("-1");
        }
    }

    private static boolean nextPermutation(int[] arr) {
        int a = arr.length - 1;
        while(a>0 && arr[a - 1] > arr[a]) a--;

        if(a <= 0) return false;

        int b = arr.length - 1;
        while (arr[a - 1] >= arr[b]) b--;

        int temp = arr[a - 1];
        arr[a - 1] = arr[b];
        arr[b] = temp;

        int start = a;
        int end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return true;
    }
}
