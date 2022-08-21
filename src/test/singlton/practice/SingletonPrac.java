package test.singlton.practice;

class Singleton {
    private static Singleton one;

    private Singleton() { }

    public static Singleton getInstance() {
        if (one == null) {
            one = new Singleton();
        }
        return one;
    }
}

public class SingletonPrac {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
    }
}
