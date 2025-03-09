import java.io.*;
import java.util.*;

public class Reverse_String {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
          
        String reversedA = new StringBuilder(A).reverse().toString();
        
        if(A.equals(reversedA)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



