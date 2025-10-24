import java.util.Scanner;

public class Merge_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr1=new int[a];
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int[] arr2=new int[b];
        for(int j=0;j<b;j++){
            arr2[j]=sc.nextInt();
        }
        int[] c=new int[a+b];
        for(int i=0;i<a+b;i++){
            if(i<a){
                c[i]=arr1[i];
            }else{
                c[i]=arr2[i];
            }
        }for(int i=0;i<a+b-1;i++){
            System.out.print(c[i]);
        }
    }
}


