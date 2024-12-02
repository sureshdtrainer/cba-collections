package com.cba.filehandling.serial;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 123456L;
    private transient int id;
    private String name;

    public static int count;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' + count;
    }
}
