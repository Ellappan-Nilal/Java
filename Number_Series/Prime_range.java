package solve_problems.Number_Series;

import java.util.Scanner;

public class Prime_range {
    public static boolean isPrime(int num) {
        if (num < 2) return false; 
        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the range values
        System.out.print("Enter the lower bound: ");
        int low = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int high = scanner.nextInt();

        System.out.println("Prime numbers in the range:");
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

