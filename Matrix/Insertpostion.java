
import java.util.Scanner;

public class Insertpostion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int newId=sc.nextInt();
        int pos=n;
        for(int i=0;i<n;i++){
            if(newId<arr[i]){
                pos=i;
                break;
            }
        }
        for(int i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=newId;
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
     }
}







