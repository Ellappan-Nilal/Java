public class PrintWithSeparator {
    public static void main(String[] args) {
        String input = "Hello World";
        char separator = '-';
        String result = printWithSeparator(input, separator);
        System.out.println("Original String: " + input);
        System.out.println("String with separator: " + result);
    }

    public static String printWithSeparator(String str, char separator) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i));
            if (i < str.length() - 1) { // Add separator after each character except the last one
                result.append(separator);
            }
        }
        return result.toString();
    }
}
