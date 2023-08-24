import java.util.Scanner;

public class Weeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number over 1-7");
		int a = sc.nextInt();
		String day = " ";
		switch (a) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thrusday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid Input";
			break;
		}
		System.out.println("day==>" + day);

		sc.close();
	}

}
