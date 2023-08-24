import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		if(num==0||num==1) {
			System.out.println(num+" is not a prime number");
		}
		else {
			int middlenumber=num/2;
			for(int i=2;i<=middlenumber;i++) {
				if(num%i==0) {
					System.out.println(num+" is not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(num+" is a prime number");
			}
		}
		sc.close();

	}

}
