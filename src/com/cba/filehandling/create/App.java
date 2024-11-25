package com.cba.filehandling.create;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        File file = new File("write.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write("This is line one");
            bw.newLine();
            bw.write("This is line two");
            bw.newLine();
            bw.write("This is line three");
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Unable to write to file"+file.toString());
        }
    }
}
