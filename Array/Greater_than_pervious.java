import java.util.*;
public class Greater_than_pervious {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print(a[0]+" ");
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                System.out.print(a[i]+" ");
            }
        }
    }
            
}
