package com.kn.interface1;

public class CseStudent implements Student {

	@Override
	public void study() {
		System.out.println("Cse Student study");
	}

	@Override
	public void doproject() {
		System.out.println("Cse student do project");
	}
	

}
