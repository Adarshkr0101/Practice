package com.kn.polymorphism;

public class Rectangle extends Shape {
	int length=2,breadth=3;
	public void draw() {
		System.out.println("Rectangle drawn");
	}
	public void area() {
		System.out.println("Area of Rectangle = "+(length*breadth));		
	}

}
