public class SmallestIndexWithEqualValue {
    public static void main(String[] args) {
        SmallestIndexWithEqualValue obj = new SmallestIndexWithEqualValue();

        int[] nums = {0, 2, 3, 4, 5};
        int result = obj.smallestEqual(nums);

        System.out.println(result); 
    }

    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
