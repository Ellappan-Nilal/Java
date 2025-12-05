
package solve_problems.Leetcode.String_programming;

public class Lowercase_string {
    
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        Lowercase_string sol = new Lowercase_string();

        // Example 1
        String s1 = "Hello";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + sol.toLowerCase(s1)); // hello

        // Example 2
        String s2 = "here";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + sol.toLowerCase(s2)); // here

        // Example 3
        String s3 = "LOVELY";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + sol.toLowerCase(s3)); // lovely
    }
}


