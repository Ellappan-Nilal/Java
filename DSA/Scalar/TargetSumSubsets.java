package DSA.Scalar;
public class TargetSumSubsets {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 60;
        printTargetSumSubsets(arr, 0, "", 0, target);
    }

    
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sumSoFar, int target) {
       
        if (idx == arr.length) {
            
            if (sumSoFar == target) {
                System.out.println(set);
            }
            return;
        }

        
        printTargetSumSubsets(arr, idx + 1, set + (set.isEmpty() ? "" : ", ") + arr[idx], sumSoFar + arr[idx], target);

        printTargetSumSubsets(arr, idx + 1, set, sumSoFar, target);
    }
}