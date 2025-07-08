import java.util.Scanner;
public class Right_rotation {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int[] arr=new int[a];
       for(int i=0;i<a;i++){
           arr[i]=sc.nextInt();
       }
       int[] b=new int[a];
       int k=sc.nextInt();
       k=k/a;
       for(int i=0;i<a;i++){
          b=(i+k)%a;
       }
       System.out.print(b);
   } 
}
