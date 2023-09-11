package com.kn.armStrong;

import java.util.Scanner;

public class ArmStrongNumDemo {

	public static void main(String[] args) {
		// Take a number as user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		// Creating an object of the class ArmStongNum
		ArmStrongNum arm = new ArmStrongNum();
		// calling the class method
		arm.checkArm(num);
		// resourse release
		sc.close();
	}

}
