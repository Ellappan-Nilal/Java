import java.util.Scanner;

public class format {

    public static void main(String[] args) {
            
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
            }
            
            System.out.println("================================");

    }
}