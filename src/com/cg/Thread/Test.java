package com.cg.Thread;

public class Test extends Thread{
	
	public void run() {
		try {
			sleep(10000); // NON-RUNNABLE
			System.out.println("Thread class..");
			// DEAD
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Test t=new Test(); // NEW 
		t.start(); // RUNNABLE 
	}

}
