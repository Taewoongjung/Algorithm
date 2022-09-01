package test.ttestt.finalparametermethod;

public class Man {
    private final String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }
}
