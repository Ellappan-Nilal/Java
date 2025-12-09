package solve_problems.Leetcode.String_programming;

public class FindDifference {

    public static void main(String[] args) {

        FindDifference obj = new FindDifference();

        String s = "abcd";
        String t = "abcde";

        char result = obj.findthediffernce(s, t);
        System.out.println("The extra character is: " + result);
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
