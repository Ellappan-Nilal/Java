
package solve_problems.Leetcode.String_programming;


public class Reverse_the_words {
    
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            str.append(new StringBuilder(a[i]).reverse());
            if (i < a.length - 1)
                str.append(" ");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Reverse_the_words sol = new Reverse_the_words();

        // Example 1
        String s1 = "Let's take LeetCode contest";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + sol.reverseWords(s1));
        // Expected: "s'teL ekat edoCteeL tsetnoc"

        // Example 2
        String s2 = "Mr Ding";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + sol.reverseWords(s2));
        // Expected: "rM gniD"
    }
}


