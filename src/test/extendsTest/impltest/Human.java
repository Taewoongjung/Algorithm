package test.extendsTest.impltest;

public interface Human {
    public void walk();

    public void say();

    default void defaultMe() {
        System.out.println("prac de Me");
    }
}
