package DSA.Scalar;

public class PrintAllPermutations {
  

public class TargetSumSubsets {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 60;
        printTargetSumSubsets(arr, 0, "", 0, target);
    }

    // Recursive function to explore all subsets
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sumSoFar, int target) {
        // Base Case: if we've considered all elements
        if (idx == arr.length) {
            // Check if the current subset's sum equals target
            if (sumSoFar == target) {
                System.out.println(set);
            }
            return;
        }

        // Include current element
        printTargetSumSubsets(arr, idx + 1, set + (set.isEmpty() ? "" : ", ") + arr[idx], sumSoFar + arr[idx], target);

        // Exclude current element
        printTargetSumSubsets(arr, idx + 1, set, sumSoFar, target);
    }
}

}