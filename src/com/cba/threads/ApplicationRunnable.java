package com.cba.threads;
class RunnerRunnable implements Runnable{
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
public class ApplicationRunnable {
    public static void main(String[] args) {
        System.out.println("Hello from Main: Thread: " + Thread.currentThread().getName());
        //Runner runner1= new Runner();
        Thread thread1 = new Thread(new RunnerRunnable());
        thread1.start();
        //Runner runner2= new Runner();
        Thread thread2 = new Thread(new RunnerRunnable());
        thread2.start();
        Thread thread3 = new Thread((new Runnable() {
            @Override
            public void run() {
                //Custom logic
                for(int i =0 ; i<5; i++){
                    System.out.println("Custom Hello: " +i + "Thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }));
        thread3.start();
        System.out.println("Exiting from Main: Thread: " + Thread.currentThread().getName());
    }
}
