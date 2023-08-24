package com.kn.polygon;

public class FindType {

	public void find(int side) {
		// method to find the type of polygon
		switch (side) {
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		case 7:
			System.out.println("Heptagon");
			break;
		case 8:
			System.out.println("Octagon");
			break;
		case 9:
			System.out.println("Nanogon");
			break;
		case 10:
			System.out.println("Decagon");
			break;
		case 11:
			System.out.println("Hendecagon");
			break;
		case 12:
			System.out.println("Dodecagon");
			break;
		default:
			System.out.println("Invalid input");

		}
	}

}
