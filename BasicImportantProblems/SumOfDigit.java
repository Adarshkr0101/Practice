import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the digit");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		sc.close();
		while(num>0) {
			int lastdigit=num%10;
			num=num/10;
			sum=lastdigit+sum;
		}
		System.out.println("Sum of digit="+sum);
	}

}
