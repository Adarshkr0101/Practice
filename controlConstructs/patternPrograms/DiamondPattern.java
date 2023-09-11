package com.kn.patternPrograms;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 9; // Size of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // Print spaces for the left side of the diamond
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // Print '*' for the top half of the diamond
            }
            System.out.println(); // Move to the next line
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // Print spaces for the right side of the diamond
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // Print '*' for the bottom half of the diamond
            }
            System.out.println(); // Move to the next line
        }
    }
}
