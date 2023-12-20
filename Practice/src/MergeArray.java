import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter size of arr array");
		int size= scan.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter data for " +(i+1)+ " arr array element=");
			arr[i]=scan.nextInt();
		}
		
		System.out.print("enter size1 of brr array");
		int size1= scan.nextInt();
		
		int[] brr = new int[size1];
		
		for(int j=0;j<brr.length;j++) {
			System.out.println("enter data for " +(j+1)+ " brr array element=");
			brr[j]=scan.nextInt();
		}
	int[] crr = new int[arr.length+brr.length];
	for(int i=0;i<arr.length;i++)	{
		crr[i]=arr[i];
		}
	 for(int j=arr.length;j<crr.length;j++) {
		  crr[j]=brr[j-arr.length];
		}
	System.out.println("=>After merging two arrays<=");
	for(int i=0;i<crr.length;i++) {
		System.out.print(crr[i]+" ");
	}
		scan.close();
	}

}
