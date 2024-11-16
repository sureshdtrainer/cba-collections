package com.cba.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Collection Introduction - List");

        List<Integer> numbers = new ArrayList<>();

        //Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(10);
        numbers.add(40);
        //Retrieving
        System.out.println(numbers.get(2));

        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        //Removing items
        numbers.remove(numbers.size()-1);
        numbers.remove(0); //This is very slow
        //Retrieving
        for(Integer value: numbers){
            System.out.println(value);
        }


        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTiming("Array List", arrayList);
        doTiming("Linked List", linkedList);
    }

    private static void doTiming(String type, List<Integer> list){
        for(int i=0; i<1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for(int i=0; i<1E5; i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken: "+ (end - start) + " ms for type "+ type);

    }
}