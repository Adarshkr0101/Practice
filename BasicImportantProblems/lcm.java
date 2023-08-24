import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();sc.close();
		int lcm=(a>b)?a:b;
		while (true) {
			if(lcm%a==0&&lcm%b==0) {
				System.out.println("LCM=>"+lcm);
				break;
			}
			lcm++;
		}
	}

}
