
package solve_problems.String;

import java.util.Scanner;

public class Match_three_first_char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st1=sc.next();
        String st2=sc.next();
        if(st1.charAt(0)==st2.charAt(0) && st1.charAt(1)==st2.charAt(1) && st1.charAt(3)==st2.charAt(3)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
