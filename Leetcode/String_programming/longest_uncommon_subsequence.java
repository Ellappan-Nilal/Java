package solve_problems.Leetcode.String_programming;
public class longest_uncommon_subsequence {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return a.length() > b.length() ? a.length() : b.length();
    }

    public static void main(String[] args) {
        longest_uncommon_subsequence sol = new longest_uncommon_subsequence();

        String a = "aba";
        String b = "cdc";

        int result = sol.findLUSlength(a, b);
        System.out.println("Input: a = \"" + a + "\", b = \"" + b + "\"");
        System.out.println("Output: " + result); // Expected: 3
    }
}
