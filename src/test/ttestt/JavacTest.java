package test.ttestt;

public class JavacTest {
    public static void main(String[] args) {
        Animal cat = new Cat(true, "bravo", "general", 8, 100, false);
        Animal dog = new Dog(true, "nike", "unique", 9, 101, true);

        System.out.println(cat);
        System.out.println(dog);
    }
}
