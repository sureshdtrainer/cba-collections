package com.cba.sortinglists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }


}
*/
/*

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        if(len1 > len2)
            return 1;
        else if (len1 < len2)
            return -1;
        return 0;
    }

}
*/

/*
class ReverseAlphabeticalComprator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }

}
*/

public class App {

    public static void main(String[] args) {

        /////Sorting Strings

        List<String> animals = new ArrayList<>();

        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");

        Collections.sort(animals);

        //Collections.sort(animals, new ReverseAlphabeticalComprator());
        //Collections.sort(animals, new StringLengthComparator());

        for(String animal: animals) {
            System.out.println(animal);
        }


        //////Sorting Numbers

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);
        Collections.sort(numbers);
        /*Collections.sort(numbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }


        });
*/
        for(Integer number : numbers) {
            System.out.println(number);
        }


        /////Sorting arbitary object

  /*      List<Person> people = new ArrayList<>();

        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Clare"));
        people.add(new Person(2, "Sue"));

        Collections.sort(people, new Comparator<Person>() {
        // sort by id
            //reverse id
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId()> o2.getId())
                    return -1;
                else if (o1.getId()< o2.getId())
                    return 1;
                return 0;
            }
        });
        //sort by name
        //return o1.getName().compareTo(o2.getName());

        for(Person person : people) {
            System.out.println(person);
        }

*/
    }


}