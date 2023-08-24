import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println(a+ " " +b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println(a+ " " +b);
		sc.close();
		
	}

}
