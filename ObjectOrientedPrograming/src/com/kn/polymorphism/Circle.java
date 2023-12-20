package com.kn.polymorphism;

public class Circle extends Shape{
	int radius=10;
	public void draw() {
		System.out.println("Circle drawn");
	}
	public void area() {
		System.out.println("Area of Circle = "+(2*Math.PI*radius*radius));		
	}

}
