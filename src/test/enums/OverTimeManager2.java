package test.enums;

public class OverTimeManager2 {
    public static void main(String[] args) {
        OverTimeValues2 overTimeValues2 = OverTimeValues2.THREE_HOUR;
        System.out.println(overTimeValues2);
        System.out.println(overTimeValues2.getAmount());

        OverTimeValues2 []overTimevalues = OverTimeValues2.values();

        for (OverTimeValues2 value : overTimevalues) {
            System.out.println(value);
        }
    }
}
