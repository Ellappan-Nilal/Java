package solve_problems.Leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateI {

    public static void main(String[] args) {
        ContainsDuplicateI obj = new ContainsDuplicateI();

        int[] nums = {1, 2, 3, 4, 1};

        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);  // true
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
