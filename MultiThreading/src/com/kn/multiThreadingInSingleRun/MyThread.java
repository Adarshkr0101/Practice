package com.kn.multiThreadingInSingleRun;

public class MyThread extends Thread {

	@Override
	public void run() {
		if (Thread.currentThread().getName().equalsIgnoreCase("Number")) {
			PrintNumber();
		} else if (Thread.currentThread().getName().equalsIgnoreCase("Character")) {
			PrintCharacter();
		}
	}

	private void PrintNumber() {
		System.out.println("Number printing started");
		try {
			for(int i=1;i<10;i++) {
				System.out.println("Number = "+i);
			}	
			System.out.println("Number printing ended");
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void PrintCharacter() {
		System.out.println("Character printing started");
		try {
			for(int i=65;i<74;i++) {
				System.out.println("Character = "+(char)i);
			}		
			Thread.sleep(1000);
			System.out.println("Character printing ended");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
