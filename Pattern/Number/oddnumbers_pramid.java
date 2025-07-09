/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Pattern.Number;

import java.util.Scanner;

/**
    1 
   3 5 
  7 9 11 
 13 15 17 19 
21 23 25 27 29 
 */
public class oddnumbers_pramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;++i){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(num+" ");
                num+=2;
            }
            System.out.println();
        }
    }
}
