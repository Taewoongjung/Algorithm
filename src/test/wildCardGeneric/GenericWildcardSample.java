package test.wildCardGeneric;

import test.generic.WildCardGeneric;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample genericWildcardSample = new GenericWildcardSample();
        genericWildcardSample.callGenericMethod();
    }

//    public <T> void genericMethod(WildCardGeneric<T> c, T addValue) {
    public <T, S> void genericMethod(WildCardGeneric<T> c, T addValue, S another) {
        c.setWildcard(addValue);
        System.out.println(another);
        T value = c.getWildcard();
        System.out.println(value);
    }

    public void callGenericMethod() {
//        WildCardGeneric<String> wildcard = new WildCardGeneric<String>();
        WildCardGeneric<Integer> wildcard = new WildCardGeneric<Integer>();

//        genericMethod(wildcard, "Data");
        genericMethod(wildcard, 1, 2);
    }
}
