package solve_problems.Number_Series;

import java.util.Scanner;

public class Two_no_addtion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        int len1 = strNum1.length();
        int len2 = strNum2.length();

        long truncatedNum1;
        long truncatedNum2;

        if (len1 > len2) {
            truncatedNum1 = Long.parseLong(strNum1.substring(0, len2));
            truncatedNum2 = num2;
        } else if (len2 > len1) {
            truncatedNum1 = num1;
            truncatedNum2 = Long.parseLong(strNum2.substring(0, len1));
        } else {
            truncatedNum1 = num1;
            truncatedNum2 = num2;
        }

        long sum = truncatedNum1 + truncatedNum2;
        System.out.println(sum);
        scanner.close();
    }
}