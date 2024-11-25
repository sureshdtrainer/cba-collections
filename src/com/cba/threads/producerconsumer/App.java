package com.cba.threads.producerconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

    private static BlockingQueue<Integer> queue= new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        //Thread 1 i the producer
        Thread t1 = new Thread((new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
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
                    consumer();
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

    private static void producer() throws InterruptedException {
        Random random= new Random();
        while(true){
            int value = random.nextInt();
            queue.put(value); // if queue is full (10) it has to wait
            System.out.println("Inseted in to Queue value: " + value);
        }
    }
    private static void consumer() throws InterruptedException {

        while(true){
            Thread.sleep(1000);
            Integer value = queue.take(); //if queue is empty it waits
            System.out.println("Taken value : " + value + "Queue size is : "+ queue.size());
        }

    }
}
