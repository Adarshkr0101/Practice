package com.kn.composition;

public class Book {
	String name;
	Page page;

	public Book(String name, Page page) {
		this.name = name;
		this.page = page;
	}

	public void writeinbook(String name, Page page) {
		if (page == null) {
			System.out.println("book cannot have without page");
		} else {
			System.out.println(name + " is going to write");
		}
	}

}
