package test.generic.methodGeneric;

import test.generic.WildcardGeneric;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample genericWildcardSample = new GenericWildcardSample();
        genericWildcardSample.callGenericMethod();
    }

    public void callGenericMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        genericMethod(wildcard, "Data");
    }

    public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }

}
