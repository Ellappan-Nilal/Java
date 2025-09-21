
package solve_problems.Leetcode.String_programming;

import java.util.HashMap;
import java.util.Map;
/*
 * 
 * Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 */

public class Longest_Palindrome {
    public int longestPalindrome(String s){
        Map<Character, Integer> counts=new HashMap();
        for(char c:s.toCharArray())
            counts.put(c,counts.getOrDefault(c,0)+1);
        int result=0;
        boolean odd_found=false;
        for(int c:counts.values()){
            if(c%2==0)result+=c;
            else{
                odd_found=true;
                result+=c-1;
            }
        }
        if(odd_found) result++;
        return result;
    }
}