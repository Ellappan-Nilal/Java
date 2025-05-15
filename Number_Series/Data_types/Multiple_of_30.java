/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Number_Series.Data_types;
import java.util.Scanner;
public class Multiple_of_30 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n%30==1||n%30==2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
