package com.cba.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsVsCollectionExample {
    public static void main(String[] args) {
         /*
    Collections vs Streams
    1. C are used to store and group the data (it is a datastructure)
        S is not a datastructure. It takes input from the collections, Arrays or I/O channels to perform operations
     2.  C you can add and remove elements from collections
          S you cannot add or remove the elements
      3. C have to be iterated externally
          S are internally iterated
       4. C can be traversed multiple times
            S are traversable only once
         5. Collections are eagerly constructed
            S are lazily constructed
          6. Examples are List, SEt and Map
          vs
          filtering, mapping ,reduce
     */

        ArrayList<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("RAjeev");

        names.remove("Syed");

        for(String name: names){ //external iteration
            System.out.println(name);
        }

        for(String name: names){ //external iteration
            System.out.println(name);
        }

        Stream<String> namesStream = names.stream(); //Stream.of("Mike", "Syed","Rajeev");
        namesStream.forEach(System.out::println); //internal iteration
        names.stream().forEach(System.out::println);
    }


}
