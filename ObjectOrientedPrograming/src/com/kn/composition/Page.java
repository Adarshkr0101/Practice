package com.kn.composition;

public class Page {
	String content;
	int number;
	public Page( String content , int number) {
		this.content=content;
		this.number=number;
	}
	public void Writeinpage() {
		System.out.println(" page has content = "+this.content);
		System.out.println(" page has number = "+this.number);
	}

	

}
