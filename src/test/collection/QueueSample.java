package test.collection;

import java.util.LinkedList;

public class QueueSample {
    public static void main(String[] args) {
        QueueSample queueSample = new QueueSample();
        queueSample.checkLinkedList();
    }

    public void checkLinkedList() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("A");
        link.addFirst("B");
        System.out.println(link);
        link.offerFirst("C");
        System.out.println(link);
        link.addLast("D");
        System.out.println(link);
        link.offerLast("F");
        System.out.println(link);
        link.push("G");
        System.out.println(link);
        link.add(0, "H");
        System.out.println(link);
        System.out.println("EX=" + link.set(0, "I"));
        System.out.println(link);

        String[] a = link.toArray(new String[1]);
        for (String data : a) {
            System.out.print(data + " ");
        }
        System.out.println();
        System.out.println(a.length);
    }
}
