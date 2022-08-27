package test.extendsTest;

import java.util.List;

public class Parent {

    public Parent(List<Integer> list) {
        for (Integer temp : list) {
            System.out.println(temp);
        }
    }

    public Parent(String name) {
        System.out.println("My name is " + name);
    }

    public Parent() {

    }

    public void printParent() {
        System.out.println("this is Parent class");
    }
}
