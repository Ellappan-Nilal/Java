package solve_problems.Number_Series;

import java.util.Scanner;
public class Findtheelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Find the element");
        int f=sc.nextInt();
        for(int var:arr){
            if(var==f){
                System.out.print("yes");
                return;
            }
        }
        System.out.print("no");
    }
}
