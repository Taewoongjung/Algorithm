package test.baseball.V2;

import java.util.List;

public class Ball {
    private final Integer number;
    private final Integer position;
    private static List<Ball> arr;

    static {
        // 1-9사이만 가능
    }

    public Ball(final Integer number, final Integer position) {
        this.number = number;
        this.position = position;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getPosition() {
        return position;
    }

    public boolean isValid() {
        if (number < 0) return false;
        if (number > 9) return false;
        return true;
    }
}
