package solve_problems.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ransomnote {

    public static void main(String[] args) {
        Ransomnote obj = new Ransomnote();

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = obj.canConstruct(ransomNote, magazine);
        System.out.println("Can construct ransom note: " + result);
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        // Count characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check characters in ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
