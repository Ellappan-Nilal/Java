package Interview_questions;

public class Deletealternatecharacters {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = deleteAlternateCharacters(input);
        System.out.println("Original String: " + input);
        System.out.println("String after deleting alternate characters: " + result);
    }

    public static String deleteAlternateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) { // Keep characters at even indices
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
