/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Number_Series;

import java.util.Scanner;

/**
 * Input 1546827 output 1+5+7=13
 */
public class Sum_of_ODD_digits_in_String {
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = Integer.valueOf(s);
    int sum = 0;
    while(n>0){
        int r=n%10;
        if(r%2!=0){
            sum=sum+r;
        }
        n=n/10;
}
    System.out.print(sum);
}
}