package com.cba.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main2
{
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(treeMap);


    }

    private static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "lion");
        map.put(15, "bear");
        map.put(6, "snake");

        for(Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key + " : " +value);
        }

    }
}
