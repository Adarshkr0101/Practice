import java.util.Scanner;

public class QuadracticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three values of roots");
		// give input a=1,b=5,c=2;
		System.out.println("Enter input 1");
		double a=sc.nextDouble();
		System.out.println("Enter input 2");
		double b=sc.nextDouble();
		System.out.println("Enter input 3");
		double c=sc.nextDouble();
		double result=b*b-4.0*a*c;
		sc.close();
		if(result>0.0) {
			double r1=(-b+Math.pow(result, 0.5)/(2.0*a));
			double r2=(-b-Math.pow(result, 0.5)/(2.0*a));
			System.out.println("The Roots are "+r1+" and "+r2);
		}else if (result==0) {
			double r1=(-b/(2.0*a));
			System.out.println("The Root are "+r1);
		}else {
			System.out.println("The equation has no roots");
		}

	}

}
