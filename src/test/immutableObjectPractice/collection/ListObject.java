package test.immutableObjectPractice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListObject {
    private final List<Animal> animals;

    public ListObject(List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(animals);
    }
}
