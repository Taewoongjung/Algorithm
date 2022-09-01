package test.ttestt.finalparametermethod;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String name = main.nameChange(new Man("Jot"));
        System.out.println(name);
    }

    public String nameChange(Man man) {
        return man.getName();
    }
}
