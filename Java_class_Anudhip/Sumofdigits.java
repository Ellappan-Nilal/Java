package solve_problems.Java_class_Anudhip;
public class Sumofdigits {
    public static void main(String[] args) {
        int n = 1356;
        int sum = 0;
        do {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        } while (n != 0);
        System.out.println("Sum of digits = " + sum);
    }
}
