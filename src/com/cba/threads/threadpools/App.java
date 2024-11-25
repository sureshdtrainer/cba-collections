package com.cba.threads.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable{
    private int id;

    public Processor(int id){
        this.id= id;
    }
    @Override
    public void run() {
        System.out.println("Starting: " + id);
        try {
            if(id==4) {
                Thread.sleep(60000);
            }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: " + id);
    }
}

public class App {

    public static void main(String[] args) {
        //Create a thread pool of 2 and assigne some task to be executed in parallel
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for(int i=0; i<5; i++){
            executor.submit(new Processor(i));

        }
        executor.shutdown();
        System.out.println("All Task Submitted");
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All task completed");
    }
}
