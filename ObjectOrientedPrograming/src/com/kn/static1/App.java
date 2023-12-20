package com.kn.static1;

public class App {
	// Static variables
	static int a, b;
	// static blocks
	static {
		System.out.println("Static Block");
		a = 10;
		b = 20;
	}

	// Static methods
	public static void m1() {
		System.out.println("Static Method");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	// Instance variables
	int x, y;
	// Instance block
	{
		System.out.println("Instance Block");
		a = 11;
		b = 12;
		x = 100;
		y = 200;
	}

	// Instance Method
	public void m2() {
		System.out.println("Instance Method");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + x);
		System.out.println("d = " + y);
	}

	// Constructor
	public App() {
		System.out.println("Constructor of App");
	}
}
