package com.cba.threads.synchronize;

public class App {

    private volatile int count=0;

    private final Object lock = new Object();

    public static void main(String[] args) {
        App app = new App();
        app.doWork();
    }

    public void increment(String threadName){
        synchronized(lock) {
            count++; //count=count + 1;
        }
    }

    public void doWork(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                Thread.yield();
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
    thread1.setPriority(1);
    thread2.setPriority(10);
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
