package solve_problems.Number_Series;

import java.util.Scanner;

public class Add_or_Subract {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int number = sc.nextInt();
        int pri = sc.nextInt();

        
        int reverse = 0, temp = number;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Reversed Number: " + reverse);

        boolean isPrime = true;
        if (pri <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(pri); i++) {
                if (pri % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

       
        if (isPrime) {
            System.out.println("Result: " + (reverse + pri));
        } else {
            System.out.println("Result: " + (reverse - pri));
        }
    }
}





