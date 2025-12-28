public class DivisibleandNondivisibleSumsDifference {
    public static void main(String[] args){
        int[] nums={10,12,8,6};
        int k=5;
        int result=divisiblenondivisiblediff(nums,k);
        System.out.println("Difference between divisible and non-divisible sums: " + result);
    }
    public static int divisiblenondivisiblediff(int[] nums, int k) {
        int divisibleSum = 0;
        int nonDivisibleSum = 0;

        for (int num : nums) {
            if (num % k == 0) {
                divisibleSum += num;
            } else {
                nonDivisibleSum += num;
            }
        }

        return Math.abs(divisibleSum - nonDivisibleSum);
    }
}
