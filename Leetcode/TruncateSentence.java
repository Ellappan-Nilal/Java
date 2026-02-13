public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder truncated = new StringBuilder();
        
        for (int i = 0; i < k && i < words.length; i++) {
            truncated.append(words[i]);
            if (i < k - 1 && i < words.length - 1) {
                truncated.append(" ");
            }
        }        
        return truncated.toString();
    }
}
