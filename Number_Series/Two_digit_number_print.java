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
public class Two_digit_number_print {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int printed=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=10&&arr[i]<=99){
                System.out.print(arr[i]+" ");
                printed=1;
            }
        }
        if(printed==0){
            System.out.print("=1");
        }
    }
}
