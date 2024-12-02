package com.cba.funcprog;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //if number is >10 return true or else false
        Predicate<Integer> p1= i->i>10;
        System.out.println(p1.test(100));

        //i>10 and number is even number
        Predicate<Integer> p2 = i -> i%2==0;
        System.out.println(p1.and(p2).test(20));

        // i>10 || number is even
        System.out.println(p1.or(p2).test(4));

        //i>10 && odd
        System.out.println(p1.and(p2.negate()).test(33));

        //all instructors who teaches online
        Predicate<Instructor>  ip1= (i) -> i.isOnlineCourses();

        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            if(ip1.test(instructor)){
                System.out.println(instructor);
            }
        });
        //instructor years of exp is greater than 10
        Predicate<Instructor> ip2 = i -> i.getYearsofExperience()>10;

        BiConsumer<String, List<String>> biConsumer = (name,course) ->
                System.out.println("Name is "+ name +" courses: "+ course);
        instructors.forEach(instructor -> {
            if(ip1.and(ip2).test(instructor)){
                biConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }

}
