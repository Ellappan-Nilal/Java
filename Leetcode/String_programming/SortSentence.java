package String_programming;

public class SortSentence {

    public static void main(String[] args) {
        SortSentence obj = new SortSentence();

        String s = "is2 sentence4 This1 a3";
        String result = obj.sortSentence(s);

        System.out.println(result); // Output: This is a sentence
    }

    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];

        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            sorted[index] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", sorted);
    }
}
