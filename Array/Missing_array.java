import Java.util.*;
public class Missing_array {
    Scanner sc=new Scanner(System.in);
    public void missing(){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]>1){
                for(int j=arr[i]+1;j<arr[i+1];j++){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
