/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Leetcode.String_programming;

/**
 *
 * @author Nilal
 */
public class FindDifference {

    public static void main(String[] args) {

    }

    public char findthediffernce(String s, String t) {
        int s_sum = 0;
        int t_sum = 0;
        for (int i = 0; i < s.length(); i++) {
            s_sum += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            t_sum += t.charAt(i);
        }
        int result = t_sum - s_sum;
        return (char) result;
    }
}
