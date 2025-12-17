import java.util.HashMap;
import java.util.Map;

public class SumofUniqueElements {

    public static void main(String[] args) {
        SumofUniqueElements obj = new SumofUniqueElements();

        int[] nums = {1, 2, 3, 2};
        int result = obj.sumOfUnique(nums);

        System.out.println("Sum of unique elements: " + result);
    }

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
