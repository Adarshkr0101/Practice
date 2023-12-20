package com.kn.multiLevelInheritance;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.drive();
		c1.hornk();
		c1.registrationNumber=9999;
		c1.color="White";
		System.out.println("Car Regestration number = "+c1.registrationNumber);
		System.out.println("Car Color = "+c1.color);
		System.out.println("************************");
		SUV s1 = new SUV();
		s1.drive();
		s1.hornk();
		s1.registrationNumber=923;
		s1.color="Black";
		System.out.println("Car Regestration number = "+s1.registrationNumber);
		System.out.println("Car Color = "+s1.color);
		System.out.println("************************");
		Harrier h1 = new Harrier();
		h1.drive();
		h1.hornk();
		h1.registrationNumber=9876;
		h1.color="Blue";
		System.out.println("Car Regestration number = "+h1.registrationNumber);
		System.out.println("Car Color = "+h1.color);
		System.out.println("************************");

	}

}
