/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Leetcode.String_programming;

/**
 *
 * Input: s = "abab" Output: true Explanation: It is the substring "ab" twice.
 * Example 2:
 *
 * Input: s = "aba" Output: false
 */
public class Repated_substring_pattern {

    public static class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {  // candidate substring length must divide total length
                int num_repeats = len / i;
                String substring = s.substring(0, i); // ✅ take substring of length i
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < num_repeats; j++) {
                    sb.append(substring);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.repeatedSubstringPattern("abab"));        // true
        System.out.println(sol.repeatedSubstringPattern("aba"));         // false
        System.out.println(sol.repeatedSubstringPattern("abcabcabcabc"));// true
    }
}

}