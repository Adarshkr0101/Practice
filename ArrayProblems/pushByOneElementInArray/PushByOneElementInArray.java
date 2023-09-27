package com.kn.pushByOneElementInArray;

//create a method for push the array element by one
public class PushByOneElementInArray {

	public int[] push(int[] arr) {
		int[] brr=new int[arr.length];
		int temp = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			brr[i] = arr[i - 1];
		}
		brr[0] = temp;
		return brr;
	}

	public int[] pushBefore(int[] arr) {
		int temp = arr[0];
		int[] crr = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			crr[i] = arr[i + 1];
		}
		crr[arr.length - 1] = temp;
		
		
		return crr;
		
	}

}
