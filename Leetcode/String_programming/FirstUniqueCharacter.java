package solve_problems.Leetcode.String_programming;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        FirstUniqueCharacter obj = new FirstUniqueCharacter();

        String s = "leetcode";   // Example input
        int index = obj.firstUniqChar(s);

        System.out.println("First unique character index: " + index);
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; 
    }
}
