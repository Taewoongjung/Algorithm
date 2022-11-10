package main.boj_16967;

import java.io.*;
import java.util.*;

public class Main {
    static int H;
    static int W;
    static int X;
    static int Y;
    static int[][] B; // 입력 데이터
    static int[][] A; // 원본

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        B = new int[H + X][W + Y];
        A = new int[H][W];

        for (int i = 0; i < H + X; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < W + Y; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i - X >= 0 && j - Y >= 0) { // 밖에 나가지 않으면
                    A[i][j] = B[i][j] - A[i - X][j - Y];
                } else {
                    A[i][j] = B[i][j];
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
