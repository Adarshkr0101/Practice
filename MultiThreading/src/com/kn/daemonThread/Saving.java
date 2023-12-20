package com.kn.daemonThread;

public class Saving extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 1;; i++) {
				System.out.println("Code is Saving "+i );
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
