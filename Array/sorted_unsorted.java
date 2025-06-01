
import java.util.Scanner;
public class sorted_unsorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean bool=true;
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]){
                bool=true;
            }
        }
        if(bool){
            System.out.print("Sorted Array");
        }else{
            System.out.print("Unsortded Array");
        }
    }
}
