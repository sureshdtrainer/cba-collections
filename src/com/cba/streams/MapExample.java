package com.cba.streams;

import com.cba.funcprog.Instructor;
import com.cba.funcprog.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        //return only instructor names from the instructor list
        List<String> instructorNames = Instructors.getAll().stream()
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(instructorNames);
    }
}
