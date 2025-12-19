package String_programming;

import java.util.HashSet;
import java.util.Set;

public class ChecktheSentenceisPangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = checkIfPangram(sentence);
        System.out.println(result);
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

        return set.size() == 26;
    }
}
