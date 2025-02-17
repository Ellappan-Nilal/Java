package solve_problems.Number_Series;

import java.util.Scanner;

public class FiboPrime {
    // Function to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = 0;
        while (sqrt * sqrt < num) {
            sqrt++;
        }
        return (sqrt * sqrt == num);
    }

    // Function to check if a number is a Fibonacci number
    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false; // Prime numbers start from 2
        for (int i = 2; i * i <= n; i++) { // Check divisibility up to sqrt(n)
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int num = scanner.nextInt();

        // Check if it's both Fibonacci and Prime
        if (isFibonacci(num) && isPrime(num)) {
            System.out.println("FiboPrime");
        } else {
            System.out.println("Not FiboPrime");
        }

        scanner.close();
    }
}
