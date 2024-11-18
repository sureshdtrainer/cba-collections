package com.cba.generics;


public class App3<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        App3<Integer> integerBox = new App3<Integer>();
        App3<String> stringBox = new App3<>();

        integerBox.set(10);
//		integerBox.set("ten"); // compilation error

        stringBox.set("Hello World");
//		stringBox.set(10); // compilation error

        Integer integer = integerBox.get();
        String string = stringBox.get();

        System.out.printf("Integer Value : %d\n\n", integer);
        System.out.printf("String Value : %s\n", string);
    }
}
