package solve_problems.String;
import java.util.Scanner;
public class Previous_and_NextCharacter {
    public static void main(String[] args){
        
        if(ch=='a'){
            System.out.print("z" + ++ch);
        }else if(ch=='z'){
            System.out.print(--ch + "a");
        }else{
            System.out.println((char)(ch-1)+" "+(char)(ch+1));
        }
    }
}
