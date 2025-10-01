import java.util.*;
import java.util.Arrays;
class Remove_element {
    public int removeElement(int[] nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of the elements in tha array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the elements of the Array");
        for(int i=0; i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter tha valueto remove");
        int val=sc.nextInt();
        
        Remove_element sol=new Remove_element();
        int k=sol.removeElement(nums, val);
        System.out.print("K ="+k);
        System.out.print("nums =[");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]);
            if(i<k-1){
                System.out.print(",");
               
                
            }
        }
        System.out.print("]");
        System.out.println();
    }
    }



    