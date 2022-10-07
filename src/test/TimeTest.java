package test;

import java.time.LocalDate;

public class TimeTest {
    public static void main(String[] args) {
        Hanoi(5, 0, 1, 2);
    }

    static void Hanoi(int N, int start, int mid, int to) {

        if (N == 1) {
            System.out.println(start + " " + to);
            return;
        }

        Hanoi(N - 1, start, to, mid);

        System.out.println(start + " " + to);

        Hanoi(N - 1, mid, start, to);
    }
}
