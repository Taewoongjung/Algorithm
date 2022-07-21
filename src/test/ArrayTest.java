package test;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next().toCharArray();
        }
        System.out.println("처음 = " + a[1][0]);
        char t = a[1][0];
        a[1][0] = a[2][0];
        a[2][0] = t;

        System.out.println(t);
        System.out.println("바뀐 후 = " + a[1][0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
