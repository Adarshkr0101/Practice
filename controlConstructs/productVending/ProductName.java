package com.kn.productVending;

public class ProductName {

	void find(String[] productCodes, String[] productNames, String userInput) {
		String productName = null;
		for (int i = 0; i < productCodes.length; i++) {
			if (userInput.equalsIgnoreCase(productCodes[i])) {
				productName = productNames[i];
				break;
			}
		}

		// Display the product name or an error message
		if (productName != null) {
			System.out.println("You have selected: " + productName);
		} else {
			System.out.println("Invalid product code. Please try again.");
		}
	}

}
