package test.hmaptest;

import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkProperties();
    }

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("A", "1");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
    }

    public void checkKeySet() {
        HashMap<String, String> map = new HashMap<>();
        map.put("keyA", "a");
        map.put("keyB", "b");
        map.put("keyZ", "z");
        Set<String> keySet = map.keySet();
        for (String temp : keySet) {
            System.out.println(temp + " = " + map.get(temp));
        }
        System.out.println("All = " + map.values());
    }

    public void checkProperties() {
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for (Object temp : keySet) {
            System.out.println(temp + " = " + prop.get(temp));
        }
    }
}
