package com.kn.interface1;

public class MechStudent implements Student{

	@Override
	public void study() {
			System.out.println("Mech Student study");
	}

	@Override
	public void doproject() {
		System.out.println("Mech Student do project");
	}
	

}
