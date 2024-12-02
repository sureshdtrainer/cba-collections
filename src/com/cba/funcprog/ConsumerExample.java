package com.cba.funcprog;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Consumer with Single statement
        Consumer<String> consumer = (x)-> System.out.println(x.length()+ "is the length and the value of x: " +x);
        consumer.accept("Hello from Java Training");

        //Consumer for block statement
        Consumer<Integer> consumer1 = (x) -> {
            System.out.println("x * x = "+ x*x);
            System.out.println("x / x =" + x/x);
        };
        consumer1.accept(10);
    }
}
