/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Number_Series;

import java.util.Scanner;

/**
 *
 * @author Nilal Example Input/Output 1: Input: manager e
 *
 * Output: manag
 *
 * Example Input/Output 2: Input: Everest e
 *
 * Output: Ev
 */
public class Print_string_till_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        if (str.length() >= 3 && str.length() <= 100) {
            System.out.print("Enter End char :");
            char endchar = sc.next().charAt(0);
            int end = str.indexOf(endchar);
        for (int i = 0; i < end; i++) {
            System.out.print(str.charAt(i));
        }
            //Print_string_till_Character ob = new Print_string_till_Character();
            //ob.printUptoString(str, endchar);

            /*
        int index = str.indexOf(endchar);
        String newstr = str.substring(0, index);
        System.out.println(newstr);
             */
        }else{
            System.out.println("Enter the string length 3-100 only."); 
        }

        // creating object
    }

    void printUptoString(String str, char ch) {
        int end = str.indexOf(ch);
        for (int i = 0; i < end; i++) {
            System.out.print(str.charAt(i));
        }
    }
}


