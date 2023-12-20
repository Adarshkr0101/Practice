package com.kn.daemonThread;

public class Compilation extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 1;; i++) {
				System.out.println("Code is Compiling "+i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
