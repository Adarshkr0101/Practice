package com.kn.multiThreadingScenarioF;

public class PizzaHutDemo {

	public static void main(String[] args) {
		PizzaHut ph=new PizzaHut();
		Baker b=new Baker(ph);
		Customer c=new Customer(ph);
		Thread t1=new Thread(b);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		
	}

}
