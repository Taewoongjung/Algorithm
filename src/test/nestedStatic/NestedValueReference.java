package test.nestedStatic;

import java.util.EventListener;

public class NestedValueReference {
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    private int privateInt = 3;
    static int staticInt = 4;

    static class StaticNested { // Nested static class
        public void setValue() {
            staticInt = 77;
        }
    }

    class Inner { // Inner class
        public void setValue() {
            publicInt = 11;
            protectedInt = 12;
            justInt = 13;
            privateInt = 14;
            staticInt = 15;
        }
    }

    public void setValue() {
        EventListener listener = new EventListener() {
            public void onClick() {
                publicInt = 9;
                protectedInt = 12;
                justInt = 13;
                privateInt = 14;
                staticInt = 15;
            }
        };
    }
}
