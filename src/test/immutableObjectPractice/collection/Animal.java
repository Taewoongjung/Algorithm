package test.immutableObjectPractice.collection;

public class Animal {
    private final Age age;

    public Animal(final Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}

class Age {
//    private int value;
    private final int value;

    public Age(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

//    public void setValue(final int value) {
//        this.value = value;
//    }

    @Override
    public String toString() {
        return "Age{" +
                "value=" + value +
                '}';
    }
}
