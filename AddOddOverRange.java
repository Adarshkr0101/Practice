import java.util.Scanner;

public class AddOddOverRange {

	public static void main(String[] args) {
		System.out.println("Enter the range to add");
		Scanner sc =new Scanner(System.in);
		int lo=sc.nextInt();
		int up=sc.nextInt();
		int sum=0;
		sc.close();
		for(int i=lo;i<=up;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of odd numbers = "+sum);
	}

}
