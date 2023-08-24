package com.kn.productVending;

import java.util.Scanner;

public class ProductVending {

	public static void main(String[] args) {
		// Initialize the product code and names
		String[] productCodes = { "A1", "A2", "B1", "B2" };
		String[] productNames = { "Soda", "Chips", "Water", "Candy" };
		// User input of code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid product code");
		String userInput = sc.nextLine();
		// Create the ProductName Object
		ProductName pn = new ProductName();
		//Categorize the productNames
		pn.find(productCodes, productNames, userInput);
		// close the scanner objects
		sc.close();

	}

}
