package test.immutableObjectPractice.collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(new Age(1)));

        ListObject listObject = new ListObject(animals);

        for (Animal animal : listObject.getAnimals()) {
            System.out.println(animal.getAge().getValue());
        }
        System.out.println();

        animals.add(new Animal(new Age(2)));

        for (Animal animal : listObject.getAnimals()) {
            System.out.println(animal.getAge().getValue());
        }
        System.out.println();
    }
}
