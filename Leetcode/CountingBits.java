package solve_problems.Leetcode;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        CountingBits solution = new CountingBits();
        
        int n = 5;  
        int[] result = solution.countBits(n);
        
        System.out.println(Arrays.toString(result));
        // Output: [0, 1, 1, 2, 1, 2]
    }

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }
}
