import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		double a=sc.nextDouble();
		System.out.println("Enter number 2");
		double b=sc.nextDouble();
		System.out.println("Enter number 3");
		double c=sc.nextDouble();
		sc.close();
		if(a>b) {
			if(a>c) {
				System.out.println("Greatest="+a);
			}else System.out.println("Greatest="+c);
		}else if(b>c) {
			System.out.println("Greatest="+b);
			
		}else System.out.println("Greatest="+c);
		
	
	}

}
