package solve_problems.Number_Series;

import java.util.Scanner;

public class Perfect_number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("No"); 
            scanner.close(); 
            return;
        }

        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) { 
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
