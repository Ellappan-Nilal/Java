package String_programming;

public class AllCharactersHaveEqualNumberOccurrences {

    public static void main(String[] args) {
        AllCharactersHaveEqualNumberOccurrences obj =
                new AllCharactersHaveEqualNumberOccurrences();

        String s = "abacbc";   // test input
        boolean result = obj.areOccurrencesEqual(s);

        System.out.println("All characters have equal occurrences: " + result);
    }
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int occurrence = -1;

        for (int freq : count) {
            if (freq > 0) {
                if (occurrence == -1) {
                    occurrence = freq;
                } else if (occurrence != freq) {
                    return false;
                }
            }
        }
        return true;
    }
}
