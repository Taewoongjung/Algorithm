package test.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        ListSample listSample = new ListSample();
        listSample.checkArrayList8();
    }

    public void checkArrayList1() {
        ArrayList list1 = new ArrayList();
        list1.add(new Object());
        list1.add("ArrayListSample");
        list1.add(new Double(1));
        System.out.println(list1); // 이렇게 여러 타입을 하나의 ArrayList 에 담지 말자

        ArrayList<String> list2 = new ArrayList<String>(); // 이런 식으로 제네릭을 사용해서 타입을 지정해서 하나의 타입만 담는것이 좋다.
        list2.add("a");
        list2.add("b");
        list2.add("a");
        System.out.println(list2);
    }

    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add(1, "A1");
        for (String data : list) {
            System.out.println(data);
        }

        System.out.println(); System.out.println();

        ArrayList<String> list2 = new ArrayList<>(list); // 2. 이것이 다른 방법이다. (생성자를 통해
        list2.add("0 ");
//        list2.addAll(list); // 1. 이렇게 복사 하지 않아도 되고 다른 방법이 있다.

        for (String data : list2) {
            System.out.println(data);
        }
    }

    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("A");
        list.add("B");
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            System.out.println("list.get(" + i + ")= " + list.get(i));
        }

        int a = list.indexOf(new String("A"));
        System.out.println(a);
    }

    public void checkArrayList5() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);
    }

    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] tempArray = new String[7];
        String[] strList = list.toArray(tempArray);
        for (String data : strList) {
            System.out.println(data);
        }
    }

    public void checkArrayList8() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
//        System.out.println("Removed " + list.remove(0));
//        System.out.println(list.remove("A"));
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("Q");
        temp.add("Z");
        list.removeAll(temp);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ")= " + list.get(i));
        }

        List list1 = Collections.synchronizedList(new ArrayList<String>());
        list1.add(1);
        System.out.println(list1);
    }
}