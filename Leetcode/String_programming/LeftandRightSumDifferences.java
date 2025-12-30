package String_programming;

public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        int[] result = leftRightDifference(nums);
        System.out.print("Resulting array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] result = new int[n];

        // Calculate left sums
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        // Calculate right sums
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        // Calculate the absolute differences
        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return result;
    }
}
