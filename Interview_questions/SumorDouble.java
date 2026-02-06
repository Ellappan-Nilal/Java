import java.util.Scanner;

public class SumorDouble {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int sum=a+b;
         if(a==b){
             System.out.println(sum);
         }else{
             System.out.println(sum*2);
       }
	}
}
