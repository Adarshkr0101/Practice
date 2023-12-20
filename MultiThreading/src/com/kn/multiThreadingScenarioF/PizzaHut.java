package com.kn.multiThreadingScenarioF;

public class PizzaHut {
	int token;
	boolean isAvailable = false;

	synchronized public void bake(int num) {
		
		try {
			if (isAvailable == false) {
				token = num;
				System.out.println("Baked Pizza for token = " + token);
				isAvailable = true;
				notify();
			} else {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void eat() {
		try {
			if (isAvailable == true) {
				System.out.println("Eaten baked pizza of token = " + token);
				isAvailable = false;
				notify();
			} else {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
