package com.kn.abstarction;

public class SmartCal extends Calculator {
	//Over riding the abstract methods of parent class
	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplication  = "+(a*b));
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division = "+(a/b));
	}
	
}
