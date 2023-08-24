import java.util.Scanner;

public class sumofnaturalrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Sum of all natural numbers are : "+sum(n));
		sc.close();
	}

	public static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}

}
