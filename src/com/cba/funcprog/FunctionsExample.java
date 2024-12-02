package com.cba.funcprog;

import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;

public class FunctionsExample {

    public static void main(String[] args) {
        //Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        Function<Integer, Double> sqrt = Math::sqrt; //Method Reference
        System.out.println("Square root of 64: " + sqrt.apply(64));

        Function<String, String> lowercaseFunction = s1 -> s1.toLowerCase();
        System.out.println(lowercaseFunction.apply("PROGRAMMING"));

        Function<String, String> concatFunction = s1 -> s1.concat(" In Java");

        System.out.println(lowercaseFunction.andThen(concatFunction).apply("PROGRAMMING"));
        System.out.println(lowercaseFunction.compose(concatFunction).apply("PROGRAMMING"));
    }
}
