package com.cba.threads;
class Runner extends Thread{
    @Override
    public void run(){
        //Custom logic
        for(int i =0 ; i<5; i++){
            System.out.println("Hello: " +i + "Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ApplicationExtends {
    public static void main(String[] args) {

        System.out.println("Hello from Main: Thread: " + Thread.currentThread().getName());
        Runner runner1= new Runner();
        runner1.start();

        Runner runner2= new Runner();
        runner2.start();
        System.out.println("Exiting from Main: Thread: " + Thread.currentThread().getName());
    }
}
