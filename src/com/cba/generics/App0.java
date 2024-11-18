package com.cba.generics;

import java.util.ArrayList;
import java.util.HashMap;

class Animal{

}

public class App0 {

    public static void main(String[] args) {
        //Generics in Java
        //Before Java 5/////////
        ArrayList fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        String fruit = (String) fruits.get(1);
        System.out.println(fruit);

        //JAva 5 and later
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");

        String animal = animals.get(1);

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ArrayList<Animal> animals2 = new ArrayList<>();

        ///JAVA 7 , 8

        ArrayList<String> stringList = new ArrayList<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
    }

}
