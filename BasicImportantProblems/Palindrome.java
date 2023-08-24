import java.util.Scanner;

public class Palindrome {

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        // Reverse the number
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            num /= 10;
        }

        // Check if the original number and reversed number are the same
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
