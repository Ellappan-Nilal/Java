package solve_problems.Leetcode;
import java.util.Arrays;
public class ReverseString {
    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        System.out.println(Arrays.toString(s));      // Output: [o, l, l, e, h]
    }
  public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }
    }
}
