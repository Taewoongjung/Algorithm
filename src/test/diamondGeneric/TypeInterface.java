package test.diamondGeneric;

public class TypeInterface {
    public static void main(String[] args) {
        TypeInterface type = new TypeInterface();
        type.makeObjects3();
    }

    public void makeObjects1() {
        GenericClass<Integer> generic1 = new GenericClass<>("String");
        generic1.setValue(777);
    }

    public void makeObjects2() {
        GenericClass<Integer> generic1 = new GenericClass("String");
        generic1.setValue(777);
    }

    public void makeObjects3() {
        GenericClass<Integer> generic1 = new <String> GenericClass<Integer>("String");
        generic1.setValue(777);
    }

    public void makeObjects4() {
        GenericClass<Integer> generic1 = new <String> GenericClass<>("String");
        generic1.setValue(777);
    }
}
