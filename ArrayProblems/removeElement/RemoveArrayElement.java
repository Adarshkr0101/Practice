package com.kn.removeElement;

public class RemoveArrayElement {

	public int[] deleteElement(int[] arr, int key) {
		int index=-1;
		
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] == key) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			for(int i=index;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
		}

		return arr;
	}

}
