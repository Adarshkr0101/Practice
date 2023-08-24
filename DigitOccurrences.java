import java.util.Scanner;

public class DigitOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int[] digitCounts = new int[10]; // Array to store occurrences of each digit
        
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            digitCounts[digit]++;   // Increment the count for the digit
            number /= 10;            // Remove the last digit from the number
        }
        
        System.out.println("Occurrences of each digit:");
        for (int i = 0; i < 10; i++) {
            if (digitCounts[i] > 0) {
                System.out.println("Digit " + i + ": " + digitCounts[i] + " times");
            }
        }
        
    }
}
