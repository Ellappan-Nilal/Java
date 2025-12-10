
package solve_problems.Leetcode;

public class SplitBalancedString {
    public static void main(String[] args) {
        SplitBalancedString obj = new SplitBalancedString();

        System.out.println(obj.balancedStringSplit("RLRRLLRLRL")); // 4
        System.out.println(obj.balancedStringSplit("RLRRRLLRLL")); // 2
        System.out.println(obj.balancedStringSplit("LLLLRRRR"));   // 1
        System.out.println(obj.balancedStringSplit("RLRLRLRL"));   // 4
    }
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}

