package com.cba.threads.volatileexample;

import java.util.Scanner;

//Volatile keyword guarantees that any thread that it reads is filed will see the most recently written value
//and ignore any cached value in thread instead refers to the parent copy only.

class Processor extends Thread{
	private volatile boolean running = true;
	@Override
	public void run() {
		
		while(running) {
			System.out.println("Running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void shutdown() {
		running = false;
		
	}
}

public class


App {

	public static void main(String[] args) {
		
		Processor pro = new Processor();
		
		pro.start();

		//Wait for the enter key
		System.out.println("Enter something to stop the Thread, ");
		new Scanner(System.in).nextLine();
		pro.shutdown();

	}

}
