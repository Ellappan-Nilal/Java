
package solve_problems.DSA.Singly_Linked_list;

public class Merge_sort {
    public static void mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            
            merge(arr,l,mid,r);
        }
    }
    private static void merge(int[] arr, int l, int mid, int r) {
        int a1=mid-l+1;
        int a2=r-mid;
        
        int lArr[]=new int[a1];
        int rArr[]=new int[a2];
        for(int x=0;x<a1;x++){
            lArr[x]=arr[l+x];
        }
        for(int x=0;x<a2;x++){
            rArr[x]=arr[mid + 1 + x];
        }
        int i=0;
        int j=0;
        int k=l;
        
        while(i<a1 && j<a2){
            if(lArr[i]<=rArr[j]){
                arr[k]=lArr[i];
                i++;
            }
            else{
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }
        while(i<a1){
            arr[k]=lArr[i];
            i++;
            k++;
        }
        while(j<a2){
            arr[k]=rArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        int arr[]={3,5,1,4,6,2};
         System.out.println("Before sorting");
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
        mergesort(arr,0,arr.length-1);
        System.out.println("After sorting");
        for(int n:arr){
            System.out.print(n+" ");
        }
        
    }    
}


