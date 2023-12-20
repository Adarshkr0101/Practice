package com.kn.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		Pilot p = new Pilot("fly higher", 10007.0);
		Airlines a = new Airlines("KingFisher", p);
		a.operation();
		p.fly();
		a = null;
		System.out.println("-------------------");
		p.fly();
	}

}
