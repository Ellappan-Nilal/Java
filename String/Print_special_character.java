import java.util.Scanner;

public class Print_special_character {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String specialChars = extractSpecialCharacters(inputString);
        System.out.println(specialChars);
        scanner.close();
    }

    public static String extractSpecialCharacters(String inputString) {
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                sb.append(ch); 
            }
        }
        return sb.toString(); 
    }
}