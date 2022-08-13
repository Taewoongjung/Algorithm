package test.staticTest;

import java.util.Objects;

public class StaticTest {
    static int a = 1;
    static int b = 1;

    public static void main(String[] args) {
        int z = add(a, b);
        System.out.println(z);

        stuDTO stu = new stuDTO("alice", 12);
        System.out.println(stu.getName());
        stu.add();
        System.out.println(stu.getName());
        stuDTO stu2 = new stuDTO("bob", 13);
        System.out.println(stu2.getName());
        stu2.add();
        System.out.println(stu2.getName());
        System.out.println(stu.getName());

        System.out.println(stu.check());
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
