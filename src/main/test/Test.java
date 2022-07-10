package main.test;

public class Test {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        System.out.println(age);
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarried(boolean flag) {
        isMarried = flag;
    }

    public boolean isMarried() {
        if(isMarried) {
            System.out.println("기혼");
            return true;
        } else {
            System.out.println("비혼");
            return false;
        }

    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public static void main(String[] args) {
        Test ts = new Test();
        ts.setAge((byte) 29);
        ts.setName("정태웅");
        ts.setMarried(false);

        ts.getAge();
        ts.isMarried();
        ts.getName();
    }
}
