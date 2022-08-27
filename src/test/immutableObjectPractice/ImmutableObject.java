package test.immutableObjectPractice;

import java.util.Objects;

public class ImmutableObject {
    private final int first;
    private final int second;

    public ImmutableObject(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "ImmutableObject{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
