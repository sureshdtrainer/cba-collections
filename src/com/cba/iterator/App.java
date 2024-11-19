package com.cba.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        //old way
        Iterator<String> it = animals.iterator();

        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);

//        if(value.equals("cat")) {
                it.remove();
  //          }
        }

        System.out.println();


        //new way

        for(String animal: animals) {
            System.out.println(animal);
            //animals.remove("dog");
        }


    }

}