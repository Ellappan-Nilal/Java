package Infosys;
import java.util.Scanner;
public class Seedvaluemultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();   // Seed number
        int y = sc.nextInt();   // Target number        
        int temp = x;
        int product = x;
        // Multiply x with each of its digits
        while (temp != 0) {
            product *= (temp % 10);
            temp /= 10;
        }

        if (product == y) {
            System.out.println(x + " is a seed of " + y);
        } else {
            System.out.println(x + " is not a seed of " + y);
        }

        sc.close();
    }
}

