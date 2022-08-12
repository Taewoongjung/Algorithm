package test.generic.wildcardGenericTest;

import test.generic.WildcardGeneric;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample carWildcardSample = new CarWildcardSample();
        carWildcardSample.callCarBoundedWildcardMethod();
    }

    public void callCarBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Car("FantasyCar"));
        boundedWildcardMethod(wildcard);
    }

    public void callBusBoundedWildcardMethod() {
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Bus("1100"));
        boundedWildcardMethod(wildcard);
    }

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Object value = c.getWildcard();
        System.out.println(value);
    }
}
