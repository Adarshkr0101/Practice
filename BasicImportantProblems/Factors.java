import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("Factors of this number:");
		sc.close();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i +" ");
			}
		}
	}

}
