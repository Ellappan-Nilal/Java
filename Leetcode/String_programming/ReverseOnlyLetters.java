/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.Leetcode.String_programming;

/**
 *
 * @author Nilal
 */
public class ReverseOnlyLetters {

    public static void main(String[] args) {

    }

    public static String reverseOnlyletters(String s) {
        int start = 0;
        int end = s.length() - 1;
        char ch[] = s.toCharArray();
        while (start < end) {
            if (!Character.isLetter(ch[start])) {
                start++;
            } else if (!Character.isLetter(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}
