package com.cba.funcprog;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        IntConsumer intConsumer = (x) -> System.out.println(x*10);
        intConsumer.accept(10);

        LongConsumer longConsumer = (x) -> System.out.println(x*10L);
        longConsumer.accept(10L);

        DoubleConsumer doubleConsumer = (x) -> System.out.println(x*10);
        doubleConsumer.accept(10.50);

        //BiConsumer for printing two numbers
        BiConsumer<Integer,Integer> biConsumer = (x,y) -> System.out.println("x: "+ x + "y: "+y);
        biConsumer.accept(20,30);

        List<Instructor> instructorList = Instructors.getAll();
        //print name and gender of instructors
        BiConsumer<String, String> biConsumer1 = (name, gender) -> System.out.println("name is " + name + " and gender is " + gender);
        instructorList.forEach(instructor -> biConsumer1.accept(instructor.getName(), instructor.getGender()));


    }
}
