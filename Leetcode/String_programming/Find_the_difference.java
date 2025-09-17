
package solve_problems.Leetcode.String_programming;

/**
 *
 *Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
 */
public class Find_the_difference {
    public static void main(String[] args){
        String s="abce";
        String t="abcde";
        System.out.print(finddiffer(s,t));
    }
    public static char finddiffer(String s,String t){
        int total=0;
        for(int i=0;i<t.length();i++){
            total=total+t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            total=total-s.charAt(i);
        }
        return (char)total;
    }
}
