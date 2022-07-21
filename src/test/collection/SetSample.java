package test.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        SetSample setSample = new SetSample();
        String []cars = new String[]{
                "Sonata", "BMW", "Benz",
                "Lexus", "Lamboreugini", "Maybach",
                "RolceRoyce", "SM7", "Tico", "Audi",
                "Benz", "Tico"
        };
        System.out.println(setSample.getCarKinds(cars));
    }

    public int getCarKinds(String[] cars) {
        if ( cars == null ) return 0;
        if ( cars.length == 1 ) return 1;

        Set<String> hashSet = new HashSet<String>();
        for (String data : cars) {
            hashSet.add(data);
        }
//        printCarSet(hashSet);
        printCarSet2(hashSet);
        return hashSet.size();
    }

    public void printCarSet(Set<String> carSet) {
        for (String temp : carSet) {
            System.out.println(temp + " ");
        }
    }

    public void printCarSet2(Set<String> carSet) {
        Iterator<String> iterator = carSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
