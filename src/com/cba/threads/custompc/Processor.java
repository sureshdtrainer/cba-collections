package com.cba.threads.custompc;

import java.util.*;

public class Processor {

    private LinkedList<Integer> list = new LinkedList<>();
    private final int LIMIT= 10;
    private Object lock = new Object();


    public void producer() throws InterruptedException {
        int value =0;
        while(true){
            synchronized (lock){
                System.out.println("Producer thread Running");
                while(list.size() == LIMIT){
                    lock.wait();
                }
                list.add(value);
                System.out.println("Producer added: "+value + "Queue size is "+ list.size());
                value++;
                //notifiy
                lock.notify();
            }

        }

    }
    public void consumer() throws InterruptedException {
        while(true){
            synchronized (lock){
                while(list.size()==0){
                    lock.wait();
                }
                int value = list.removeFirst();
                System.out.println("Removed value by consumer : "+value);
                System.out.println("Now the list size is: "+ list.size());
                //notify
                lock.notify();
            }
            Thread.sleep((new Random().nextInt(1000)));

          }
    }
}
