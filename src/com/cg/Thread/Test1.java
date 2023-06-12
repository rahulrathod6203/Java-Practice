package com.cg.Thread;

public class Test1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable..");
	}

	public static void main(String[] args) {

		Test1 test1 = new Test1();
		Thread th = new Thread(test1);
		th.start();
	}

}
