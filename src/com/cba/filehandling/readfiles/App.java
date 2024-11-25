package com.cba.filehandling.readfiles;

import java.io.*;

public class App {
    public static void main(String[] args) {
        //Read the file
        File file = new File("test.txt");
        BufferedReader br= null;
        System.out.println(file.getAbsoluteFile());
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            //trywithbr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " +file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read the file: "+ file.toString());
        }finally{
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
