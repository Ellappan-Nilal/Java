/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Leetcode.String_programming;

import java.util.HashMap;
import java.util.Map;


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
