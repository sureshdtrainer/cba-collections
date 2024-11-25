package com.cba.filehandling.serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObjects {

    public static void main(String[] args) {
        System.out.println("REading Object...");
        try(FileInputStream fi = new FileInputStream("people.bin")){
            ObjectInputStream os = new ObjectInputStream(fi);

            try {
                Person person1 = (Person)os.readObject();
                Person person2 = (Person)os.readObject();
                os.close();
                System.out.println(person1);
                System.out.println(person2);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
