package com.cba.lambda;

public class HelloWorldTraditional implements HelloWorldInterface{
    @Override
    public String sayHelloWorld() {
        return "Hello World!!!";
    }

    public static void main(String[] args) {
        HelloWorldInterface helloworldTraditional = new HelloWorldTraditional();
        helloworldTraditional.sayHelloWorld();
    }
}
