/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Leetcode;

import java.util.Arrays;

public class plusone {
    public static void main(String[] args){
        int[] digits={1,2,3};
        System.out.println(Arrays.toString(plusone(digits)));
    }
    static int[] plusone(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
           if(digits[i]<9) {
               digits[i]++;
               return digits;
           }
           digits[i]=0;
        }
        int[] newNo=new int[n+1];
        newNo[0]=1;
        return newNo;
     }
}
