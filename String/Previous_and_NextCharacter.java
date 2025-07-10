package solve_problems.String;
import java.util.Scanner;
public class Previous_and_NextCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a'){
            System.out.print("z" + ++ch);
        }else if(ch=='z'){
            System.out.print(--ch + "a");
        }else{
           
        }
    }
}
