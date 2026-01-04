package String_programming;

public class MaximumNumberofBalloons {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
    public static int maxNumberOfBalloons(String text) {
        int[] charCount = new int[26];

        for (char c : text.toCharArray()) {
            charCount[c - 'a']++;
        }

        int countBalloons = 0;
        while (charCount['b' - 'a'] >= 1 &&
               charCount['a' - 'a'] >= 1 &&
               charCount['l' - 'a'] >= 2 &&
               charCount['o' - 'a'] >= 2 &&
               charCount['n' - 'a'] >= 1) {

            charCount['b' - 'a']--;
            charCount['a' - 'a']--;
            charCount['l' - 'a'] -= 2;
            charCount['o' - 'a'] -= 2;
            charCount['n' - 'a']--;

            countBalloons++;
        }

        return countBalloons;
    }
}
