package solve_problems.Number_Series;

import java.util.Scanner;
public class Right_rotation {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
       int[] a=new int[s];
       for(int i=0;i<s;i++){
           a[i]=sc.nextInt();
       }
       int[] b=new int[s];
       int k=sc.nextInt();
       k=k%s;
       for(int i=0;i<s;i++){
          b[(i+k)%s]=a[i];
       }
      for(int i=0;i<s;i++){
          System.out.print(b[i]+" ");
      }
   } 
}
