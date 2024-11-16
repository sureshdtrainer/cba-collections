package com.cba.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        //Adding
        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");
        map.put(6, "Hello...");
        //Retreving
        String text = map.get(6);

        System.out.println(text);

        //Retreving
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }
}
