package solve_problems.Number_Series;

import java.util.*;
public class ASCII_value {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        int a=0;
        for(int i=0;i<s.length();i++){
            a+=s.charAt(i);
        }
        System.out.print(a);
    }
}
