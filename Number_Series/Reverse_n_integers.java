package solve_problems.Number_Series;

import java.util.Scanner;

public class Reverse_n_integers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
