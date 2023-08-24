import java.util.Scanner;

public class IncomeTaxCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Income amount");
		double income=sc.nextDouble();
		double taxAmt;
		if(income<250000) {
			 taxAmt=0;
		}else if(income<=500000) {
			taxAmt=0.05*(income-250000);
		}else if(income<=1000000) {
			taxAmt=0.20*(income-500000)+12500;
		}else {
			taxAmt=0.30*(income-1000000)+12500+100000;
		}
		System.out.println("Income Amount="+income);
		long value=(long)taxAmt;
		System.out.println("Tax Amount="+value);
		sc.close();
	}

}
