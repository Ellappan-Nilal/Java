public class ShuffleString {

    public static void main(String[] args) {
        ShuffleString obj = new ShuffleString();
        
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 1, 2, 3};

        String result = obj.shuffle(s, indices);
        
        System.out.println("Shuffled String: " + result);
    }

    public String shuffle(String s, int[] indices) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() != indices.length) {
            return "";
        }

        char[] chars = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            int pos = indices[i];
            chars[pos] = s.charAt(i);
        }

        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }
        return result.toString();
    }
}
