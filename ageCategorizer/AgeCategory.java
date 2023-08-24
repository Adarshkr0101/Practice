package com.kn.ageCategorizer;

public class AgeCategory {

	public void distinguish(int age) {
		if(age>=0&&age<=12) {
			System.out.println("Child");
		}else if(age>=13&&age<=19) {
			System.out.println("Teen Age");
		}else if(age>=20&&age<=50) {
			System.out.println("Adults");
		}else {
			System.out.println("Seniors");
		}
	}

}
