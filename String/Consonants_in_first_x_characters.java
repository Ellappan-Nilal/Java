package solve_problems.String;

import java.util.Scanner;

public class Consonants_in_first_x_characters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] arr=sc.nextLine().toCharArray();
        int x=sc.nextInt();
        String vowels="aeiouAEIOU";
        boolean printed=false;
        for(int in=0;in<x;in++){
            if(vowels.indexOf(arr[in])==-1){
                System.out.print(arr[in]);
                printed=true;
            }
        }
        if(!printed){
            System.out.println("-1");
        }
    }
}
