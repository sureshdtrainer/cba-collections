package com.cba.threads.custompc;


import com.cba.threads.waitandnotifiy.Processor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Processor processor = new Processor();
        //Thread 1 i the producer
        Thread t1 = new Thread((new Runnable() {
            @Override
            public void run() {
                try {
                    processor.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }));


        //Thread2 is the consumer
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();

        Thread.sleep(30000);
        System.exit(0);

    }
}
