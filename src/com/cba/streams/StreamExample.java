package com.cba.streams;

import com.cba.funcprog.Instructor;
import com.cba.funcprog.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //Create a Map of Names and Courses of instructors.
        //online have more than 10 yrs experience

        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses();
        Predicate<Instructor> p2 = i-> i.getYearsofExperience()>10;

        List<Instructor> instructorList = Instructors.getAll();
    instructorList.stream().filter(p1).filter(p2);

        Map<String, List<String>> map = instructorList.stream()
                .filter(p1)
                .filter(p2)
                .peek(s -> System.out.println(s))
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
        System.out.println(map);
    }
}
