package com.cba.funcprog;

import javax.management.InstanceNotFoundException;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //Looping through all instructor and printing out the values of intructor
        Consumer<Instructor>  c1 = (s1) -> System.out.println(s1);
        instructors.forEach(c1);
        System.out.println("-------------------------");
        //Loop Through all the instructor and only print out their name
        Consumer<Instructor>  c2 = (s1) -> System.out.println(s1.getName());
        instructors.forEach(c2);
        System.out.println("-------------------------");
        //Loop through all the instructors and print out their names and their courses
        Consumer<Instructor>  c3 = (s1) -> System.out.println(s1.getCourses());
        instructors.forEach(c2.andThen(c3));
        System.out.println("-------------------------");
        //Loop through all the instructors and print out their name if the years of experience is > 10
        instructors.forEach(s1 -> {
            if(s1.yearsofExperience > 10){
                c1.accept(s1);
            }
        });
        System.out.println("-------------------------");
        //Loop through all the instructors and print out their name and courses
        // if years of experience is > 5 and doesn't teach course online.
        instructors.forEach(s1 -> {
            if(s1.yearsofExperience > 5 && !s1.isOnlineCourses()){
                c2.andThen(c3).accept(s1);
            }
        });




    }
}
