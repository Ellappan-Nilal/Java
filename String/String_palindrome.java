import java.util.*;
public class String_palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String org=sc.nextLine();
        String rev="";
        for(int i=org.length()-1;i>=0;i--){
            rev=rev+org.charAt(i);
        }
        System.out.println(rev);
        if(org.equals(rev)){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not palindrome");
        }
    }
}



