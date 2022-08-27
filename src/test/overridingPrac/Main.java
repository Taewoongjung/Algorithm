package test.overridingPrac;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.say();


        Animal animal = new Animal();

        Cat aa = (Cat) animal;

    }
}
