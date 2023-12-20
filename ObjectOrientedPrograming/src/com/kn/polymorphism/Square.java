package com.kn.polymorphism;

public class Square extends Shape{
	int side=5;
	public void draw() {
		System.out.println("Square drawn");
	}
	public void area() {
		System.out.println("Area of Square = "+(side*side));		
	}

}
