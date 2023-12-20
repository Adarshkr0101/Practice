package com.kn.multiThreadingInSingleRun;

public class MultiThreadingInSingleRunMethod {

	public static void main(String[] args) {
		MyThread m=new MyThread();
		m.setName("Number");
		m.start();
		MyThread m2=new MyThread();
		m2.setName("Character");
		m2.start();
	}

}
