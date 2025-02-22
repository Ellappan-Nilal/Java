import java.util.*;
public class Mutiplication_table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the table :");
        int t=sc.nextInt();
        System.out.print("End what until? ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+" x "+n+" = "+n*i);
        }
    }
}
