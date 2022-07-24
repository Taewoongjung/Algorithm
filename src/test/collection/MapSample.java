package test.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample mapSample = new MapSample();
//        mapSample.checkHashMap();
//        mapSample.checkKeySet();
//        mapSample.checkValues();
        mapSample.checkHashMapEntry();
    }

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        System.out.println(map.get("A"));
        map.put("A", "1");
        System.out.println(map.get("A"));
    }

    public void checkKeySet() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("S", "S");

        Set<String> keySet = map.keySet();
        for (String data : keySet) {
            System.out.println(data +" = " + map.get(data));
        }
    }

    public void checkValues() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("S", "S");

        Collection<String> keySet = map.values();
        for (String data : keySet) {
            System.out.println(data);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////

    public void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("S", "s");
        map.put("Q", "q");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> tempEntries : entries) {
            System.out.println(tempEntries.getKey() + " = " + tempEntries.getValue());
        }
    }
}
