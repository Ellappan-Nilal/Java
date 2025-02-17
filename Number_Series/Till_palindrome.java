package solve_problems.Number_Series;

import java.util.Scanner;

public class Till_palindrome {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int iteration = 0;
        while (iteration < 5) {
            if (isPalindrome(num)) {
                System.out.println(num);
                return; 
            }
            int reversedNum = reverseNumber(num);
            num = num + reversedNum;
            iteration++;
            
        }
        
    }
}
