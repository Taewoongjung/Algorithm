package test.hashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[] cars = new String[]{
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Mustang", "Grandeure",
                "The beetle", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7", "SM3", "Tico"
        };
        System.out.println(sample.getCarkinds(cars));
    }

    public int getCarkinds(String[] cars) {
        if (cars == null) return 0;
        if (cars.length == 1) return 1;
        Set<String> setString = new HashSet<>();
        for (String temp : cars) {
            setString.add(temp);
        }
        printCars(setString);
        System.out.println();
        return setString.size();
    }

    public void printCars(Set<String> set) {
//        for (String temp : set) {
//            System.out.print(temp + " ");
//        }
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
