package com.kn.polygon;

public class FindType {

	public String find(int side) {
		// method to find the type of polygon
		switch (side) {
		case 3:
			return "Triangle";
		case 4:
			return "Quadrilateral";
		case 5:
			return "Pentagon";
		case 6:
			return "Hexagon";
		case 7:
			return "Heptagon";
		case 8:
			return "Octagon";
		case 9:
			return "Nanogon";
		case 10:
			return "Decagon";
		case 11:
			return "Hendecagon";

		default:
			System.out.println("Invalid input");

		}
		return null;
	}

}
