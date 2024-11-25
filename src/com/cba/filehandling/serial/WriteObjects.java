package com.cba.filehandling.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing Objects to file");

        Person suresh = new Person(12345, "Suresh");
        Person ramesh = new Person(45678, "Ramesh");

        System.out.println(suresh);
        System.out.println(ramesh);

        try(FileOutputStream fs = new FileOutputStream("people.bin")){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(suresh);
            os.writeObject(ramesh);
            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
