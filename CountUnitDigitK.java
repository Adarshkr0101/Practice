import java.util.Scanner;

public class CountUnitDigitK {
    
	/*this program works Input: low = 2, high = 35, k = 2   
Output: 4
Numbers are 2, 12, 22, 32*/ 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the low range to be count");
		int lo=sc.nextInt();
		System.out.println("Enter the top range to be count");
		int up=sc.nextInt();
		System.out.println("Enter the digit");
		int k = sc.nextInt();
		System.out.println("Number of digits are : "+countunitdigit(lo,up,k));
		sc.close();
		
	}

	public static int countunitdigit(int lo, int up, int k) {
		int count=0;
		for(int i=lo;i<=up;i++) {
			if(i%10==k) {
				count++;
			}
		}
		return count;
	}

}
