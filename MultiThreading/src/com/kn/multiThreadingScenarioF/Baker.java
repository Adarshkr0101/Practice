package com.kn.multiThreadingScenarioF;

public class Baker implements Runnable {
	PizzaHut ph;
	int num = 0;

	public Baker(PizzaHut ph) {
		this.ph = ph;
	}

	public void run() {
		while (true) {
			ph.bake(num++);
		}
	}
}
