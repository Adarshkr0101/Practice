import java.util.Scanner;

public class FloatingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		float num=sc.nextFloat();
		if(num>0) {
			 if(num>1000000) {
				System.out.println(num+" Exceeds the range(Large)");
			}
			System.out.println(num+" is positive");
		}else if(num==0) {
			System.out.println(num+" is equals to zero(0)");
		}
		else if(num<0){
			System.out.println(num+" Exceeds the range(Small)");
			System.out.println(num+" is negative");
		}
		sc.close();
	}

}
