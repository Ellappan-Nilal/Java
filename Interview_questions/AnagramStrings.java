package Interview_questions;

public class AnagramStrings {

    static int areAnagram(String S1, String S2) {
        
        // Step 1: Check length
        if (S1.length() != S2.length()) {
            return 0;
        }
        
        // Step 2: Create frequency array
        int[] count = new int[26];
        
        // Step 3: Count characters
        for (int i = 0; i < S1.length(); i++) {
            count[S1.charAt(i) - 'a']++;
            count[S2.charAt(i) - 'a']--;
        }
        
        // Step 4: Check frequency
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return 0;
            }
        }
        
        return 1;
    }
}

