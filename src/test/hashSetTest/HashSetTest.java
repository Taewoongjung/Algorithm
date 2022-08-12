package test.hashSetTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList<>();
        arrList.add("aa");
        arrList.add("aa");
        arrList.add("aa");
        arrList.add("bb");
        arrList.add("bb");
        arrList.add("zz");

        Set hset = new HashSet(arrList);
        System.out.println(hset.size());
        System.out.println(hset);
        System.out.println(hset.contains("zzs"));
        System.out.println(hset.getClass().getSimpleName());
    }
}
