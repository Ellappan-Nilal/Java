
package solve_problems.Leetcode.String_programming;

public class Rotate_String {
  
    public boolean rotateString(String s, String goal) {
        return (s.length() == goal.length() && (s + s).contains(goal));
    }

    public static void main(String[] args) {
        Rotate_String sol =new Rotate_String ();

        // Example 1
        String s1 = "abcde";
        String goal1 = "cdeab";
        System.out.println("Input: s = " + s1 + ", goal = " + goal1);
        System.out.println("Output: " + sol.rotateString(s1, goal1)); // true

        // Example 2
        String s2 = "abcde";
        String goal2 = "abced";
        System.out.println("Input: s = " + s2 + ", goal = " + goal2);
        System.out.println("Output: " + sol.rotateString(s2, goal2)); // false
    }
}


