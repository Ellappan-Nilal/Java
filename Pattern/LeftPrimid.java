/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slove_problems.Pattern;

import java.util.Scanner;

    /*
   **
  ***
 ****
*****
 */
public class LeftPrimid {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for (int i = 1; i <= n; i++) {
            
            for (int j = i; j < n; j++) {
                System.out.print("  "); 
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
   }
}
