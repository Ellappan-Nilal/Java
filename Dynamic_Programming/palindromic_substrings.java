
package solve_problems.Dynamic_Programming;

import java.util.*;
public class palindromic_substrings {
    
    static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    static int countWays(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // base case: empty string has 1 way

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (isPalindrome(s, j, i - 1)) {
                    dp[i] += dp[j];
                }
            }
        }
        return dp[n];
    }

    
    public static void main(String[] args) {
        String s1 = "a";
        System.out.println(countWays(s1)); 

        String s2 = "aba";
        System.out.println(countWays(s2));

        String s3 = "aaa";
        System.out.println(countWays(s3)); // Output: 4 (["aaa"], ["a","aa"], ["aa","a"], ["a","a","a"])
    }
}


