package String_programming;

public class PercentageofLetterinString {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetter(s, letter));
    }

    public static int percentageLetter(String s, char letter) {
        int count = 0;
        int length = s.length();

        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }

        return (count * 100) / length;
    }
}
