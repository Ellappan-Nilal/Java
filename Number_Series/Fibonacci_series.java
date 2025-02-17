package solve_problems.Number_Series;


import java.util.Scanner;

public class Fibonacci_series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
       long  n1=0,n2=1,n3,i;
       System.out.println(n1+"\n"+n2);
       for(i=2;i<c;++i){
           n3=n1+n2;
           System.out.println(n3);
           n1=n2;
           n2=n3;
       }
    }
    
}
