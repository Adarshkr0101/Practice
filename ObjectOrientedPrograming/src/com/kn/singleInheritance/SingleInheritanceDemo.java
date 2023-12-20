package com.kn.singleInheritance;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.drive();
		c1.hornk();
		System.out.println("********************");
		PoushCar p1 = new PoushCar();
		p1.drive();
		p1.hornk();

	}

}
