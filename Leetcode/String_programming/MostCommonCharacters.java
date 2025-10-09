/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Leetcode.String_programming;

/**
 *
 * @author Nilal
 */import java.util.*;
public class MostCommonCharacters {

    public List<String> commonChars(String[] words) {
        int[] common = new int[26];
        Arrays.fill(common, Integer.MAX_VALUE);

        for (String word : words) {
            int[] cnt = new int[26];
            for (char c : word.toCharArray()) {
                cnt[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                common[i] = Math.min(common[i], cnt[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < common[i]; j++) {
                ans.add("" + (char) ('a' + i));
            }
        }
        return ans;
    }

    // ✅ Main method to test the function
    public static void main(String[] args) {
        MostCommonCharacters sol = new MostCommonCharacters();

        // Example 1
        String[] words1 = {"bella", "label", "roller"};
        List<String> result1 = sol.commonChars(words1);
        System.out.println("Example 1 Output: " + result1);

        // Example 2
        String[] words2 = {"cool", "lock", "cook"};
        List<String> result2 = sol.commonChars(words2);
        System.out.println("Example 2 Output: " + result2);
    }
}


