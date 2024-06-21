// Author: Mayank kumar
// Date: 14-06-2024
// Description: This program has some functions to check the number is even,positive, prime and the square or not

public class NumberTools {
    // This Function Checks the number is even or uneven.
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    // This Function checks the number is positive or negative
    public static boolean isPositive(int value) {
        return value > 0;
    }

    // This function checks the number is prime or not.
    public static boolean isPrime(int value) {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    // This function checks the number is square or not.
    public static boolean isSquare(int value) {
        if (value < 0)
            return false;
        int sqrt = (int) Math.sqrt(value);
        return sqrt * sqrt == value;
    }
}