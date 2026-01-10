package solve_problems.Leetcode;

public class Valid_Anagram {
    public static void main(String[] args) {
        Valid_Anagram obj = new Valid_Anagram();
        // Example 1
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(obj.isAnagram(s1, t1)); // trues
        // Example 2
        String s2 = "rat";
        String t2 = "car";
        System.out.println(obj.isAnagram(s2, t2)); // false
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

       
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
