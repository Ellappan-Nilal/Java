package solve_problems.Leetcode;

import java.util.Arrays;

public class SquareofSortedArray {

    public static void main(String[] args) {

        int[] nums = {-7, -3, 2, 3, 11};

        SquareofSortedArray obj = new SquareofSortedArray();
        int[] result = obj.sortedSquares(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }

    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[i] = leftSq;
                left++;
            } else {
                result[i] = rightSq;
                right--;
            }
        }

        return result;
    }
}
