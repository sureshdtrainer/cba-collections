package com.cba.funcprog;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll(){
        Instructor instructor1 = new Instructor("Mike", 10, "Software Developer",
                "M", true, Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
        Instructor instructor2 = new Instructor("Jenny", 5, "Engineer",
                "F", false, Arrays.asList("Multi-Thread Programming", "CI/CD", "Unit Testing"));
        Instructor instructor3 = new Instructor("Gene", 6, "Manager",
                "M", false, Arrays.asList("C++ Programming", "C Programming", "React Native"));
        Instructor instructor4 = new Instructor("Anthony", 15, "Senior Software Developer",
                "M", true, Arrays.asList("Java Programming", "Angular Programming", "React Native"));
        Instructor instructor5 = new Instructor("Syed", 15, "Principle Engineer",
                "M", true, Arrays.asList("Java Programming","Java Multi-Threaded Programming", "Python Programming"));
       List<Instructor> instructors = Arrays.asList(instructor1,instructor2,instructor3,instructor4
       , instructor5);
       return instructors;
    }
}
