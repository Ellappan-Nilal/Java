import java.util.*;
public class Charcter_count_print_multiples {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in); 
       String co=sc.nextLine();
       for(int i=0;i<co.length();i++){
           char nu=co.charAt(i);
           System.out.print(i);
       }
    }
}
