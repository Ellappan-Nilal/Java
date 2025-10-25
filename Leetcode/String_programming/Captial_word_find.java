package solve_problems.Leetcode.String_programming;

import java.util.regex.Pattern;

public class Captial_word_find {
    public boolean detectCapitalUse(String word) {
        return Pattern.matches("([A-Z]+|[a-z]+|[A-Z][a-z]*)", word);
    }

    public static void main(String[] args) {
        Captial_word_find sol = new Captial_word_find();

        System.out.println(sol.detectCapitalUse("USA"));      // true
        System.out.println(sol.detectCapitalUse("leetcode")); // true
        System.out.println(sol.detectCapitalUse("Google"));   // true
        System.out.println(sol.detectCapitalUse("FlaG"));     // false
    }
}




