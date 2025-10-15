
package solve_problems.DSA.Singly_Linked_list.Scalar;

import java.util.Arrays;

public class Three_sum {
    public static void main(String[] args){
        int[] arr={7,-6,3,8,-1,8,-11};
        int target=0;
        sollution(arr,target,arr.length);
    }
    public static void sollution(int[] a,int target,int n){
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i==0 || (a[i]!=a[i-1])){
                int j=i+1,k=n-1;
                int tar=target-a[i];
                while(j<k){
                    if(a[j]+a[k]==tar){
                        System.out.print(a[i]+" "+a[j]+" "+a[k]);
                        while(j<k && a[j]==a[j+1])j++;
                        while(j<k && a[j]==a[k-1])k--;
                            
                        j++;
                        k--;
                    }else if (a[j]+a[k]<tar){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
    }
}
