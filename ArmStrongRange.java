import java.util.ArrayList;
import java.util.Scanner;

public class ArmStrongRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> armstrongNumbers = findArmstrongNumbersInRange(lowerBound, upperBound);

        System.out.println("Armstrong numbers in the range [" + lowerBound + ", " + upperBound + "]:");
        System.out.println(armstrongNumbers);
    }

    public static ArrayList<Integer> findArmstrongNumbersInRange(int lowerBound, int upperBound) {
        ArrayList<Integer> armstrongNumbers = new ArrayList<>();

        for (int num = lowerBound; num <= upperBound; num++) {
            if (isArmstrongNumber(num)) {
                armstrongNumbers.add(num);
            }
        }

        return armstrongNumbers;
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int numOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }

        return originalNumber == sum;
    }
}
