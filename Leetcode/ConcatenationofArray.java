public class ConcatenationofArray {
    public static void main(String[] args) {
        ConcatenationofArray obj = new ConcatenationofArray();

        int[] nums = {1, 2, 3};
        int[] result = obj.getConcatenation(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        return result;
    }   
}
