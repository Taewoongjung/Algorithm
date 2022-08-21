package test.singlton;

class Singleton {
    private Singleton() {}

    public static Singleton getInstance() {
        return new Singleton();
    }
}

public class Sample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
    }
}
