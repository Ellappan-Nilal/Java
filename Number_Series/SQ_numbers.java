package solve_problems.Number_Series;

import java.util.Scanner;

public class SQ_numbers {
    public static void findSquares(int a, int b) {
        int start = 1;
        while (start * start < a) {
            start++;
        }

        while (start * start <= b && start * start < 200) {
            System.out.print((start * start) + " ");
            start++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        findSquares(a, b);
    }
}
 
