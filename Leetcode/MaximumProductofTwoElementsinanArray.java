import java.util.Arrays;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        MaximumProductofTwoElementsinanArray obj =
                new MaximumProductofTwoElementsinanArray();

        int result = obj.maxProduct(nums);
        System.out.println("Maximum product: " + result);
    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int firstMax = nums[nums.length - 1];
        int secondMax = nums[nums.length - 2];

        return (firstMax - 1) * (secondMax - 1);
    }
}
