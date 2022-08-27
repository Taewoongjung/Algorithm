package test.extendsTest;

import java.util.List;

public class Child extends Parent {

    public static List<Integer> list;

    public Child() {
        super(list);
//        super("Father");
        System.out.println("Child constructor called");
    }

    public void childPrint() {
        System.out.println("this is child");
    }
}
