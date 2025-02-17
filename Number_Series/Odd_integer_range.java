/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Number_Series;

import java.util.Scanner;

/**
 *
 * @author Nilal
 * Input
 * 1
 * 11
 * output
 * 3 5 7 9
 */
public class Odd_integer_range {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s=sc.nextInt();
    int e=sc.nextInt();
    for(int i=s;i<=e;i++){
        if(i%2!=0 && (i>s && i<e)){
            System.out.print(i+" ");
        }
    }
}
}