package com.kn.purchaseAmount;

import java.util.Scanner;

public class PurchaseAmount {

	public static void main(String[] args) {
		//Take input from the user 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Purchase Amount");
		double purchaseAmt=sc.nextDouble();
		//Create the object for purchase amount
		PurchaseAmount1 pAmt=new PurchaseAmount1();
		//Categorize the amount for discount
		pAmt.eligible(purchaseAmt);
		//close the scanner object
		sc.close();
		}

}
