package test.stack;

import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        StackSample stackSample = new StackSample();
        stackSample.checkPeek();
    }

    public void checkPeek() {
        Stack<Integer> intStack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            intStack.push(i);
            System.out.println(intStack.pop());
        }
        System.out.println("stack = " + intStack);
        System.out.println("size = " + intStack.size());
    }
}
