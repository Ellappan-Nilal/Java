package String_programming;

public class CountPairsOfSimilarStrings {
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));
    }
    public static int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (areSimilar(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean areSimilar(String word1, String word2) {
        boolean[] charSet1 = new boolean[26];
        boolean[] charSet2 = new boolean[26];

        for (char c : word1.toCharArray()) {
            charSet1[c - 'a'] = true;
        }
        for (char c : word2.toCharArray()) {
            charSet2[c - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (charSet1[i] != charSet2[i]) {
                return false;
            }
        }
        return true;
    }
}
