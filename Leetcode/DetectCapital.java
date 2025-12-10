
package solve_problems.Leetcode;

public class DetectCapital {

    public static void main(String[] args) {
        DetectCapital obj = new DetectCapital();

        System.out.println(obj.detectCapitalUse("USA"));      // true
        System.out.println(obj.detectCapitalUse("leetcode")); // true
        System.out.println(obj.detectCapitalUse("Google"));   // true
        System.out.println(obj.detectCapitalUse("FlaG"));     // false
    }

    public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }
        if (uppercaseCount == word.length()) {
            return true;
        }
        if (uppercaseCount == 0) {
            return true;
        }

        
        if (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}


