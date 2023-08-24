import java.util.Scanner;

public class SwapWithoutThirsVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter second number");
		int y=sc.nextInt();
		System.out.println("Before Swapping="+x+" "+y);
		x = x + y;
	    y = x - y;
	    x = x - y;
	    System.out.println("After Swapping="+x+" "+y);
	    sc.close();

	}

}
