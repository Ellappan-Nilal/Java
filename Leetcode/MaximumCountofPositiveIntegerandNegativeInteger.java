public class MaximumCountofPositiveIntegerandNegativeInteger {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : nums) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        return Math.max(positiveCount, negativeCount);
    }
}
