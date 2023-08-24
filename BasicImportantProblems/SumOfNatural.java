import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range of addtion");
		System.out.println("Enter lower bound");
		int lo=sc.nextInt();
		System.out.println("Enter upper bound");
		int up=sc.nextInt();
		int sum=0;
		sc.close();
		for(int i=lo;i<=up;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of natural numbers are : "+sum);

	}

}
