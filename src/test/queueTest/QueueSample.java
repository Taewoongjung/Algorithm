package test.queueTest;

import java.util.LinkedList;

public class QueueSample {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
//        link.add("A");
//        link.offer("A");
        link.pop();
        System.out.println(link.peekFirst());
    }
}
