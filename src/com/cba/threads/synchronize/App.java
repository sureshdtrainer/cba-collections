package com.cba.threads.synchronize;

public class App {

    private volatile int count=0;

    public static void main(String[] args) {
        App app = new App();
        app.doWork();
    }

    public void increment(String threadName){
        synchronized(this) {
            count++; //count=count + 1;
        }
    }

    public void doWork(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<10000; i++){
                    increment(Thread.currentThread().getName());
                    //count++; //count=count + 1
                }
                System.out.println("Thread logic Count is: "+ count + " "+ Thread.currentThread().getName());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<10000; i++){
                    increment(Thread.currentThread().getName());
                    //count++; //count=count + 1
                }
                System.out.println("Thread logic Count is: "+ count + " "+ Thread.currentThread().getName());
            }
        });
     //start both the threads
    thread1.start();
    thread2.start();

    //wait for both the threads to complete

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is: "+ count + ""+ Thread.currentThread().getName());
    }
}
