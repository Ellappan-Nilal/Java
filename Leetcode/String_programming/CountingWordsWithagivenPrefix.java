package String_programming;

public class CountingWordsWithagivenPrefix {
    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        int prefLength = pref.length();

        for (String word : words) {
            if (word.length() >= prefLength && word.substring(0, prefLength).equals(pref)) {
                count++;
            }
        }

        return count;
    }
}
