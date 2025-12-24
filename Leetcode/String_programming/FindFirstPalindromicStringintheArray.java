package String_programming;

public class FindFirstPalindromicStringintheArray {
    public static void main(String[] args){
        String[] words = {"abc","car","ada","racecar","cool"};

        String result = firstPalindrome(words);

        System.out.println("First palindromic string in the array: " + result);
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
