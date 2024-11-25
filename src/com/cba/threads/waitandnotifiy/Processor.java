package com.cba.threads.waitandnotifiy;

import java.util.Random;
import java.util.Scanner;

public class Processor {


    public void producer() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread Running");
            //inform the consumer
            wait();
            System.out.println("Resumed......!!!");
        }

    }
    public void consumer() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("Waiting for return key.....");
            scanner.nextLine();
            System.out.println("Return key pressed!");
            notify();
            Thread.sleep(5000);
            System.out.println("Consumption logic is done");
        }
    }
}
