import java.util.Arrays;

public class Anagram {

    public static boolean areAnagramsSimple(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        
        String str3 = "hello";
        String str4 = "world";

        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + areAnagramsSimple(str1, str2)); // true
        System.out.println("Are \"" + str3 + "\" and \"" + str4 + "\" anagrams? " + areAnagramsSimple(str3, str4)); // false
    }
}