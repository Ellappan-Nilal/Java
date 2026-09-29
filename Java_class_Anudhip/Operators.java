package solve_problems.Java_class_Anudhip;

import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        // Arithmetic
        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        // Relational
        System.out.println("\nRelational Operations:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical
        System.out.println("\nLogical Operations:");
        System.out.println("a > 0 && b > 0 : " + (a > 0 && b > 0));
        System.out.println("a > 0 || b > 0 : " + (a > 0 || b > 0));
        System.out.println("!(a > 0) : " + !(a > 0));

        sc.close();
    }
}