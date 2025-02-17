package solve_problems.Number_Series;

import java.util.Scanner;
public class Palindrome {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        if(originalNum == reversedNum){
            System.out.print("Palidrome "+reversedNum);
        }else{
            System.out.print("Not palindrome "+reversedNum);
        }
    } 
}
