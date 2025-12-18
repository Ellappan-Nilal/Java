package String_programming;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        MergeStringsAlternately obj = new MergeStringsAlternately();

        String word1 = "abc";
        String word2 = "pqr";

        String result = obj.mergeAlternately(word1, word2);
        System.out.println(result); // Expected output: apbqcr
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }

        if (len1 > len2) {
            merged.append(word1.substring(minLen));
        } else if (len2 > len1) {
            merged.append(word2.substring(minLen));
        }

        return merged.toString();
    }
}
