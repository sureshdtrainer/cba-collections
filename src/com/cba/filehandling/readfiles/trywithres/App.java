package com.cba.filehandling.readfiles.trywithres;

class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing the object");
    }
}

public class App {

    public static void main(String[] args) {
        //old way
        Temp temp1 = new Temp();
        try {
            temp1.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //new way

        try(Temp team2 = new Temp()){

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
