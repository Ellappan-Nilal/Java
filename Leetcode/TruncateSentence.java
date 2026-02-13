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
    public static void main(String[] args) {
        TruncateSentence ts = new TruncateSentence();
        String s = "Hello how are you Contestant";
        int k = 4;
        String result = ts.truncateSentence(s, k);
        System.out.println(result); // Output: "Hello how are you"
    }
}
