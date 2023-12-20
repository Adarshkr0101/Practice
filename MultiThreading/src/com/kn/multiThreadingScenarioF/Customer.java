package com.kn.multiThreadingScenarioF;

public class Customer implements Runnable {
	PizzaHut ph;
	int num = 0;

	public Customer(PizzaHut ph) {
		this.ph = ph;
	}

	public void run() {
		while (true) {
			ph.eat();
		}
	}

}
