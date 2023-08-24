import java.util.Scanner;

public class AddEvenOverRange {

	public static void main(String[] args) {
		System.out.println("Enter the range to add");
		Scanner sc =new Scanner(System.in);
		int lowerbound=sc.nextInt();
		int upperbound=sc.nextInt();
		int sum=0;
		sc.close();
		for(int i=lowerbound;i<=upperbound;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of even numbers = "+sum);
	}

}
