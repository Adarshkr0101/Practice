package com.kn.findArrayElement;

import java.util.Scanner;

public class FindArrayElement {

	public boolean isFindElement(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the " + (i + 1) + " Array element = ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to find in array = ");
		int ele = sc.nextInt();
		boolean find=false ;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				find = true;
			} else
				find = false;
		}
		sc.close();
		return find;

	}

}
