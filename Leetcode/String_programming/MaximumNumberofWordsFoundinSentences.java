package String_programming;

public class MaximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            maxWords = Math.max(maxWords, words.length);
        }

        return maxWords;
    }
}
