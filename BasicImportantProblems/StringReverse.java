import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String str=sc.nextLine();
		String reverse=" ";
		char ch;
		for (int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reverse=ch+reverse;
		}
		System.out.println("Revered String=" +reverse);
		sc.close();
	}

}
