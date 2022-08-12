package test.generic.wildcardGenericTest;

import test.generic.WildcardGeneric;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample wildcardSample = new WildcardSample();
        wildcardSample.callWildcardMethod();
    }

    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard("a");
        wildcardStringMethod(wildcard);

        System.out.println();
        WildcardGeneric<Integer> wildcardInteger = new WildcardGeneric<>();
        wildcardInteger.setWildcard(77);
        wildcardStringMethod(wildcardInteger);
    }

    public void wildcardStringMethod(WildcardGeneric<?> c) {
        Object value = c.getWildcard();
        System.out.println(value);
        System.out.println(value.getClass().getSimpleName());
    }

//    public void callWildcardMethod2(WildcardGeneric<?> c) {
//        WildcardGeneric<?> wildcard = new WildcardGeneric<>();
//        wildcard.setWildcard("a");
//        wildcardStringMethod(wildcard);
//    }

}
