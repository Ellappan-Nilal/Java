public class ExpressionMatching {

    public static class Solution {

        public boolean isMatch(String s, String p) {

            // If pattern is empty, string must also be empty
            if (p.length() == 0) {
                return s.length() == 0;
            }

            // Case 1: Pattern length is 1 OR next character is not '*'
            if (p.length() == 1 || p.charAt(1) != '*') {
                if (s.length() < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0))) {
                    return false;
                }
                return isMatch(s.substring(1), p.substring(1));
            }

            // Case 2: Next char is '*'
            else {
                int len = s.length();
                int i = -1;

                // Try all possible prefixes
                while (i < len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))) {

                    // Skip the x* part
                    if (isMatch(s.substring(i + 1), p.substring(2))) {
                        return true;
                    }
                    i++;
                }
                return false;
            }
        }
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isMatch("aa", "a*"));       // true
        System.out.println(sol.isMatch("ab", ".*"));       // true
        System.out.println(sol.isMatch("aab", "c*a*b"));   // true
        System.out.println(sol.isMatch("mississippi", "mis*is*p*.")); // false
    }
}
