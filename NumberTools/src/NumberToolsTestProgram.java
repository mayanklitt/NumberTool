// Author: Mayank kumar
// Date: 14-06-2024
// Description: This program has some functions to check the number is even,positive, prime and the square or not

import java.util.Scanner;

public class NumberToolsTestProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean looping = true;
        while (looping) {
            System.out.print("Please enter an integer to test: ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                System.out.println("Is " + value + " an even number? " + (NumberTools.isEven(value) ? "Yes." : "No."));
                System.out.println("Is " + value + " a positive number? " + (NumberTools.isPositive(value) ? "Yes." : "No."));
                System.out.println("Is " + value + " a prime number? " + (NumberTools.isPrime(value) ? "Yes." : "No."));
                System.out.println("Is " + value + " a square number? " + (NumberTools.isSquare(value) ? "Yes." : "No."));
            } else {
                looping = false;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}