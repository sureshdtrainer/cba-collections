package com.cba.lambda;

@FunctionalInterface
public interface HelloWorldInterface {

    //abstract method as it doesn't provide implementation
    public String sayHelloWorld();

    public default void print(){
        System.out.println("Hello");
    }
    public static void print(String text){
        System.out.println(text);
    }
}
