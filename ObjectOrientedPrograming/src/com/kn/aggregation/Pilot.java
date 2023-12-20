package com.kn.aggregation;

public class Pilot {
	String name;
	double salary;

	public Pilot(String name, double d) {
		this.name = name;
		this.salary = d;

	}

	public void fly() {
		System.out.println(this.name + " is flying");
	}

}
