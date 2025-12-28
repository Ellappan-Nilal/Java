package String_programming;
public class MaximumValueoftheStringinArray {
    public static void main(String[] args) {
        String[] strs = {"alic3", "bob", "3", "4", "00000"};
        int result = maximumValue(strs);
        System.out.println("Maximum value in the array: " + result);
    }

    public static int maximumValue(String[] strs) {
        int maxVal = 0;
        for (String str : strs) {
            int val;
            if (isNumeric(str)) {
                val = Integer.parseInt(str);
            } else {
                val = str.length();
            }
            maxVal = Math.max(maxVal, val);
        }
        return maxVal;
    }

    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
