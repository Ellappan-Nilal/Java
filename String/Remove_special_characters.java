package solve_problems.String;
import java.util.Scanner;
public class Remove_special_characters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] arr=sc.nextLine().toCharArray();
        for(char ch:arr){
            if(Character.isDigit(ch)|| Character.isLetter(ch)){
                System.out.print(ch);
            }
            
        }
    }
}
