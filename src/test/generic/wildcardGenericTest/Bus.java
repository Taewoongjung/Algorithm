package test.generic.wildcardGenericTest;

public class Bus extends Car {
    public Bus(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Bus name = " + name;
    }
}
