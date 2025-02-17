/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Number_Series;

import java.util.Scanner;

/**
 *
 * @author Nilal
 */
public class Positive_Negative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<0){
            System.out.print("Negative Number");
        }else if(x==0){
            System.out.print("Equal to zero");
        }else{
            System.out.print("Positive Number");
        }
    }
}
