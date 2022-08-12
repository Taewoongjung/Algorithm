package test.collectionTest;

import test.generic.GenericDTO;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodTest {
    public static void main(String[] args) {
        ArrayListMethodTest arrayListMethodTest = new ArrayListMethodTest();
        List list = new ArrayList<>();
        System.out.println("before size " + list.size());
        GenericDTO dto = new GenericDTO();
        dto.setObject("Hi");
        dto.setObject(12);

        list.add(arrayListMethodTest.dtoReturn(dto));

        list.add(null);
        list.add("a");
        list.add("b");
        list.add("aa");
        list.add("azaa");
        list.add("aza");
        list.add(1);
        System.out.println("after size " + list.size());

        System.out.println(list.get(0).getClass().getSimpleName());

        System.out.println(list);
        System.out.println();
        System.out.println(list.getClass().getSimpleName());

        System.out.println();
        System.out.println();
        System.out.println();

        Object[] aa = list.toArray();

        for (Object temp : aa) {
            System.out.println(temp);
        }
        System.out.println();
        System.out.println(aa.getClass().getSimpleName());
    }

    public <T> GenericDTO dtoReturn(GenericDTO<T> c) {
        return c;
    }
}
