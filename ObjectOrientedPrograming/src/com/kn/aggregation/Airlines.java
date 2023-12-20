package com.kn.aggregation;

public class Airlines {
	String name;
	Pilot pilot;

	public Airlines(String name, Pilot pilot) {
		this.name = name;
		this.pilot = pilot;
	}

	public void operation() {
		System.out.println(this.name + " Airlines is going to start operation");
	}

}
