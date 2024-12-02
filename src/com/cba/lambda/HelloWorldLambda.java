package com.cba.lambda;

import java.util.stream.IntStream;

public class HelloWorldLambda {

    public static void main(String[] args) {
        //Imperative example
        for(int i=0; i<5; i++){
            System.out.println(i);
        }

        //Declarative Example
        IntStream numbers = IntStream.of(1,2,3,4,5);
        //numbers.forEach((a)-> System.out.println(a));
        numbers.forEach(System.out::println);
        //implementing sayHelloWorld using Lambda
        HelloWorldInterface helloWorldInterface = ()-> {
            //complex logi
            return "Hello World!!";
        };
        helloWorldInterface.sayHelloWorld();
    }}

