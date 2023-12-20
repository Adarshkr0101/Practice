package com.kn.abstarction;

public abstract class Calculator {
	// concrete methods
	public void add(int a, int b) {
		System.out.println("Addition = " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("Substraction = " + (a - b));
	}

	// Abstract methods
	public abstract void mul(int a, int b);

	public abstract void div(int a, int b);

}
