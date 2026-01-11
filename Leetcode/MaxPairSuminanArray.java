import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class MaxPairSuminanArray {
    public static int maxSum(int[] nums) {        
        Map<Integer, List<Integer>> map = new HashMap<>();        
        for (int num : nums) {
            int maxDigit = getMaxDigit(num);
            map.computeIfAbsent(maxDigit, k -> new ArrayList<>()).add(num);
        }
        int ans = -1;       
        for (List<Integer> list : map.values()) {
            if (list.size() >= 2) {
                Collections.sort(list, Collections.reverseOrder());
                ans = Math.max(ans, list.get(0) + list.get(1));
            }
        }
        return ans;
    }

        private static int getMaxDigit(int num) {
        int max = 0;
        while (num > 0) {
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return max;
    } 
    public static void main(String[] args) {
        int[] nums = {51, 71, 17, 24, 42};
        System.out.println("Maximum Pair Sum: " + maxSum(nums));
    }
}
