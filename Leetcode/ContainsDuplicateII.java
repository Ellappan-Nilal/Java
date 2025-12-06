package solve_problems.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        ContainsDuplicateII obj = new ContainsDuplicateII();

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = obj.containsNearByDuplicate(nums, k);
        System.out.println(result); // true
    }

    public boolean containsNearByDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int diff = Math.abs(map.get(nums[i]) - i);
                if (diff <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
