package com.cba.streams;

import com.cba.funcprog.Instructor;
import com.cba.funcprog.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperations {

    public static void main(String[] args) {
        //return all the courses
       Long count= Instructors.getAll().stream()
                .map(Instructor::getCourses)
                       .flatMap(List::stream)
               .distinct()
               .sorted(Comparator.reverseOrder())
               .peek(System.out::println)
                                .count();
        System.out.println(count);

        boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .anyMatch(s -> s.startsWith("J"));
        System.out.println(match);
    }
}
