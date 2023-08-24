import java.util.Scanner;

public class SumofdigitofagivenPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the power");
		int pow=sc.nextInt();
		System.out.println("Sum of Power="+calculatePow(num,pow));	
		sc.close();
	}

	public static int calculatePow(int num, int power) {
		int bp=(int) Math.pow(num, power);
		System.out.println("power=>"+bp);
		int sum=0;
		while(bp!=0) {
			int d=bp%10;
			sum+=d;
			bp/=10;
			}
		return sum;
	}

}
