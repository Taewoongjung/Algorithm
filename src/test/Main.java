package test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        String a = new String("A");
//        String b = new String("A");
//        System.out.println(a.equals(b));

//        List<Object> arr = new ArrayList<Object>();
//        addElement(arr, 1);
//        addElement(arr, "1");
//          된다!!!
//        List<Object> getList = getList();
//        System.out.println(getList);


        List<Object> arr = new ArrayList<Object>();
//        addElement(arr, 1);
//        addElement(arr, "1");

//        List<Object> getList = getList();
//        System.out.println(getList);


//        List<?> arr1 = new ArrayList<>();
//        arr1.add(1);
//        arr1.add("1");
//        System.out.println(arr);


//        List<?> arr11 = getList();
//        System.out.println(arr11);
    }

    public static List<?> getList() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add("1");
        return arr;
    }

//    public static void addElement(List<?> list, Object element) {
//        list.add(element);
//    }

//    public static List<Object> getList() {
//        List<Object> arr = new ArrayList<Object>();
//        arr.add(1);
//        arr.add("1");
//        return arr;
//    }
}
