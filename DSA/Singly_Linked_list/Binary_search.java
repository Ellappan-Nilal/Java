
package solve_problems.DSA.Singly_Linked_list;

public class Binary_search {
    public static void main(String[] args){
        int[] n={2,4,6,8,10,12};
        int target=127;
        int result=binarysearch(n,target);
        if(result!=-1){
           System.out.println("Element found at index : "+result);
       }
       else{
           System.out.println("Element not found");
       }
    }

    public static int binarysearch(int[] n, int target) {
        int left=0;
        int right=n.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(n[mid]==target){
                return mid;
            }else if(n[mid]<target){
                left=mid+1; 
            }else{
                right=mid-1;
            }
        }
        return -1;
        
    }
}




