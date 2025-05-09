/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.DSA.Singly_Linked_list;

public class linear_search {
    public static void main(String[] args){
       int n[]={3,5,7,9,11};
       int target=0;
       int result=linearsearch(n,target);
       if(result!=-1){
           System.out.println("Element found at index : "+result);
       }
       else{
           System.out.println("Element not found");
       }
    }
    public static int linearsearch(int[] n, int target) {
        for(int i=0;i<n.length;i++){
            if(n[i]==target){
                return i;
            }
        }
        return -1;
    }
}
