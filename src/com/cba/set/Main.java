package com.cba.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Hash Set doesn't retain the order. Random order
        Set<String> hashSet = new HashSet<>();
        //Linked Hash SEt will maintain insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        //Tree Set will have natural order (asc default)
        Set<String> treeSet = new TreeSet<>();

        printSet(treeSet);
    }

    private static void printSet(Set<String> set) {
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("snake");
        set.add("bear");

        for(String element: set){
            System.out.println(element);
        }

        Set<String> set2 = new TreeSet<>();
        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");
        //Intersection
        Set<String> intersection = new HashSet<String>(set);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //Difference
        Set<String> difference = new HashSet<String>(set);
        difference.removeAll(set2);
        System.out.println(difference);

    }
}
