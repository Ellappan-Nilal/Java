
import java.util.Scanner;
public class Missing_elements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<a-1;j++){
            for(int k=arr[j]+1;k<arr[j+1];k++){
                System.out.print(k+" ");
            }
        }
    }
}
