package com.kn.armStrong;

public class ArmStrongNum {
//Method to check the number is arm strong or not
	public void checkArm(int num) {
		// int s = String.valueOf(num).length();
		int sum = 0, temp = num;
		while (num != 0) {

			int digit = num % 10;
			int n = digit * digit * digit;
			sum += n;
			num /= 10;

		}
		if (temp == sum) {
			System.out.println(temp + " : is ArmStrong");
		} else
			System.out.println(temp + " : is not ArmStrong");

	}
}
