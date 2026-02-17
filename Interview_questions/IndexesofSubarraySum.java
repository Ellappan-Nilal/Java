public class IndexesofSubarraySum{
    public static void main(String[] args)
{
        IndexesofSubarraySum obj = new IndexesofSubarraySum();
        int[] nums = {1, 2, 3, 7, 5};
        int target = 12;
        int[] result = obj.subarraySum(nums, target);

        if (result.length == 2) {
            System.out.println("Subarray found from index " + result[0] + " to " + result[1]);
        } else {
            System.out.println("No subarray found");
        }
    }

    public int[] subarraySum(int[] nums, int target) {
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum > target && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == target) {
                return new int[]{left, right};
            }
        }

        return new int[]{};
}}