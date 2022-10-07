package test.baseball.V2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseBallGameV2 {
    public static void main(String[] args) {
        List<Ball> ballList = new ArrayList<>();
        ballList.add(new Ball(3, 1));
        ballList.add(new Ball(5, 2));
        ballList.add(new Ball(6, 3));

        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            Ball ball1 = new Ball(input.charAt(0) - '0', 0);
            Ball ball2 = new Ball(input.charAt(1) - '0', 1);
            Ball ball3 = new Ball(input.charAt(2) - '0', 2);
            ball1.isValid();
            ball2.isValid();
            ball3.isValid();
        }
    }
}
