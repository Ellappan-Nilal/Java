/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solve_problems.Number_Series;

import java.util.Scanner;

/**
 *
 * @author Nilal
 */
public class Solve_Problems {

    /**
     input 4
     output 
     * 1 2 4 7 
     * 3 5 8 11
     * 6 9 12 14 
     * 10 13 15 16
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][] a=new int[n][n];
        int i,j,d,k=1;
        for(d=0;d<n;d++){
            for(i=0,j=d;j>=0;i++,j--){
                a[i][j]=k;
                k++;
            }
        }
        for(d=1;d<n;d++){
            for(i=d,j=n-1;i<n;i++,j--){
                a[i][j]=k;
                k++;
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
