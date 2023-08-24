import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 1-Add \n 2-substract\n 3-multiply \n 4-division \n 5-reminder");
		Scanner sc= new Scanner(System.in);
		System.out.println("choose operator");
		int operator=sc.nextInt();
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		int result;
		switch(operator) {
		case 1:result=n1+n2;
		System.out.println("Result="+result);
		break;
		case 3:result=n1*n2;
		System.out.println("Result="+result);
		break;
		case 4:result =n1/n2;
		System.out.println("Result="+result);
		break;
		case 5:result=n1%n2;
		System.out.println("Result="+result);
		break;
		case 2:result=n1-n2;
		System.out.println("Result="+result);
		break;
		default:System.out.println("Entered operator is invalid");
		}
	sc.close();	
	}

}
