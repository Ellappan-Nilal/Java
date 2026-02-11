import java.util.Scanner;

public class Sumofdigitsdivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum != 0 && number % sum == 0) {
            System.out.println("The number is divisible by the sum of its digits.");
        } else {
            System.out.println("The number is not divisible by the sum of its digits.");
        }
        
        sc.close();
    }
}
