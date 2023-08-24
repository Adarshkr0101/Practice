package com.kn.polygon;

import java.util.Scanner;

public class PolygonTypeFinding {

	public static void main(String[] args) {
		// Taking user input of number of sides
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of the polygon");
		int side = sc.nextInt();
		// Creating the new FindType Object
		FindType polygon = new FindType();
		//Categorize the type of polygon
		polygon.find(side);
		// close the scanner object
		sc.close();
	}

}
