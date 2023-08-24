package com.kn.purchaseAmount;

public class PurchaseAmount1 {
	// Method for finding discount applicable or not

	public void eligible(double purchaseAmt) {
		// check the purchase amount greater than 1000
		if (purchaseAmt > 1000) {
			System.out.println("Discount Applicable");
		}else
		System.out.println("Not Applicable for Discount");
	}

}
