import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();

		/*int count = 0;
		while (a != 0) {
			a = a / 10;
			count++;

		}
		System.out.println("number of digits : " + count);*/
		String str = String.valueOf(a);
		System.out.println("Digits=" + str.length());
	}

}
