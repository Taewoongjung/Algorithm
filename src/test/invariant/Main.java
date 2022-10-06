package test.invariant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> obj = new ArrayList<>();
        copy(integers, obj);
        System.out.println(obj);
    }

    static void copy(List<? extends Number> integer, List<? super Number> copyObj) {
        for(Number number : integer) {
            copyObj.add(number);
        }
    }
}
