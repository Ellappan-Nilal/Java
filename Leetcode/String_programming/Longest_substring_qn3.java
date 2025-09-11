/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Leetcode.String_programming;

import java.util.ArrayList;
import java.util.List;

public class Longest_substring_qn3 {
    public static void main(String[] args){
        String s="abcdabcbb";
        int start=0;
        int end=0;
        int max_length=0;
        List<Character> list=new ArrayList<Character>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.println("Max length is :"+max_length);
    }
}
