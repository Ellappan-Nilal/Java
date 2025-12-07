package solve_problems.Leetcode;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        MoveZeros obj = new MoveZeros();

        
        int[] nums = {0, 1, 0, 3, 12};

        obj.moveZeroes(nums);

        
        System.out.println(Arrays.toString(nums)); // [1, 3, 12, 0, 0]
    }

    public void moveZeroes(int[] nums) {
        int index = 0;

        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
