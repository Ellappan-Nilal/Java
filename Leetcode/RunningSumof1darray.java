import java.util.Arrays;

public class RunningSumof1darray {

    public static void main(String[] args) {
        RunningSumof1darray obj = new RunningSumof1darray();

        int[] nums = {1, 2, 3, 4};
        int[] result = obj.runningSum(nums);

        System.out.println(Arrays.toString(result));
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
