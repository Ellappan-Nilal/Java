import java.util.Scanner;
public class IntegerToString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        try{
            s=String.valueOf(n);
            int num=Integer.parseInt(s);
            if(num==n){
                System.out.println("Good job");
            }else{
                System.out.println("Wrong answer");
            }
        }catch(NumberFormatException e){
            System.out.print("Wrong answer");
        }
    }
}