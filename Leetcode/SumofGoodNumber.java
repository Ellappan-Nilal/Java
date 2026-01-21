public class SumOfGoodNumber {
    public int sumGoodNumber(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isGood = true;

            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                isGood = false;
            }            
            if (i + k < nums.length && nums[i] <= nums[i + k]) {
                isGood = false;
            }
            if (isGood) {
                sum += nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfGoodNumber obj = new SumOfGoodNumber();
        int[] nums = {1, 3, 5, 2, 4, 6};
        int k = 2;
        int result = obj.sumGoodNumber(nums, k);
        System.out.println("Sum of good numbers: " + result);
    }
}
