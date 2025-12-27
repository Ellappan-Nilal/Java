package solve_problems.Leetcode.String_programming;

public class SplitStringbySeparator {
    public static void main(String[] args) {
        String s = "one,two,,three,,four,";
        char separator = ',';

        String[] result = splitString(s, separator);

        for (String str : result) {
            System.out.println("[" + str + "]");
        }
    }

    public static String[] splitString(String s, char separator) {
        if (s == null || s.isEmpty()) {
            return new String[0];
        }

        java.util.List<String> parts = new java.util.ArrayList<>();
        StringBuilder currentPart = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == separator) {
                if (currentPart.length() > 0) {
                    parts.add(currentPart.toString());
                    currentPart.setLength(0);
                }
            } else {
                currentPart.append(c);
            }
        }
        if (currentPart.length() > 0) {
            parts.add(currentPart.toString());
        }

        return parts.toArray(new String[0]);
    }
}

    public static java.util.List<String> splitWordsBySeparator(java.util.List<String> words, char separator) {
        java.util.List<String> result = new java.util.ArrayList<>();
        
        for (String word : words) {
            String[] parts = splitString(word, separator);
            for (String part : parts) {
                result.add(part);
            }
        }
        
        return result;
    }