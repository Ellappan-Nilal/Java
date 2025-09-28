public class Reverse_words_in_a_string {
    public static void main(String[] args) {
        
        System.out.println(reverseWords("the sky is blue"));          // "blue is sky the"
        System.out.println(reverseWords("  hello world  "));          // "world hello"
        System.out.println(reverseWords("a good   example"));         // "example good a"
        System.out.println(reverseWords(""));                         // ""
        System.out.println(reverseWords("single"));                   // "single"
    }

    static String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }
}
