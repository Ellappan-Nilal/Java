
package solve_problems.Leetcode.String_programming;
import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> freq = new HashMap<>();
        
        StringBuilder word = new StringBuilder();
        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    String w = word.toString();
                    if (!bannedSet.contains(w)) {
                        freq.put(w, freq.getOrDefault(w, 0) + 1);
                    }
                    word.setLength(0); 
                }
            }
        }

        // Handle last word
        if (word.length() > 0) {
            String w = word.toString();
            if (!bannedSet.contains(w)) {
                freq.put(w, freq.getOrDefault(w, 0) + 1);
            }
        }

        // Find most frequent non-banned word
        String result = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        mostCommonWord sol = new mostCommonWord();
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        
        String result = sol.mostCommonWord(paragraph, banned);
        System.out.println("Most common word: " + result);
    }
}


