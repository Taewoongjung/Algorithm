package test.baseball.V1;

/*
* - 컴퓨터가 정답숫자를 생성해야한다.(3자리수, 1-9사이의 숫자, 겹치지 않게, 랜덤)
* - 유저는 숫자를 맞출 때 까지 3 자리 숫자를 입력 해야한다. (3자리 수, 1-9사이, 겹치지 않게)
* - 컴퓨터는 숫자를 대조해서 ball, strike를 출력해야한다.
*
* */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaseBallGameV1 {
    public static void main(String[] args) {
        String ans = "356";
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            isValidLength(input);
            isValidNumbers(input);
            isValidUnique(input);
        }
    }

    public static boolean isValidLength(String input) {
        if (input.length() != 3) return false;
        return true;
    }

    public static boolean isValidNumbers(String input) {
        // 'A' = 35
        // char - '0' = 0, 0이면
        for (int i = 0; i < 3; i++) {
            if (input.charAt(i) - '0' < 0) return false;
            if (input.charAt(i) - '0' > 9) return false;
        }
        return true;
    }

    // 1,1,1 이런 입력은 올바르지 않다
    // 1, 2, 3 이런 입력은 올바른 입력이다
    public static boolean isValidUnique(String input) {
        Set set = new HashSet();
        for (int i = 0; i < 3; i++) {
            set.add(input.charAt(i));
        }
        if(set.size() != 3) return false;
        return true;
    }
}
