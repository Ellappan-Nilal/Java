package solve_problems.DSA.Scalar;

import java.util.ArrayList;

public class TargetSumSubset {
    public static void main(String[] args){
        
    }
    public static void tes(int[] arr, int pos, boolean[] selected, ArrayList<Integer> ans){
      
    //select ith element
    ans.add(arr[i]);
    tes(arr,i+1,target-arr[i],ans);
    }
}
