import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		sc.close();
		char chars[]=str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		
		}
	

	}

}
