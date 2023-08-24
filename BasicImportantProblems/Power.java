import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter base  numbers");
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		System.out.println("Enter exponent numbers");
		int exp=sc.nextInt();
		int result=1;
		for(int i=1;i<=exp;i++) {
			result=result*base;
		}
		System.out.println("Power="+result);
		//another inbuilt method for finding power of a number
		
		System.out.println("\nEnter another base and exponent");
		int ba=sc.nextInt();
		int ex=sc.nextInt();
		System.out.println("Power="+Math.pow(ba, ex));
		sc.close();
	}
	
}
