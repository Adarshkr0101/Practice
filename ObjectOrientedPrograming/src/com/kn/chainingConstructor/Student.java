package com.kn.chainingConstructor;

public class Student {
	int id;
	String name;

	public Student() {
		super();
	}

	public Student(String name) {
		this(20);
		this.name = name;
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(int id, String name) {
		this("Reddy");

		this.id = id;
		this.name = name;
	}

}
