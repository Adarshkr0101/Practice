package com.kn.daemonThread;

public class Typing extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Code is Typing");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
