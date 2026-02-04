package Interview_questions;

public class convertstringtoLowercase {
    public static void main(String[] args) {
        convertstringtoLowercase obj = new convertstringtoLowercase();
        String str = "HeLLo WoRLd!";
        String result = obj.toLowerCase(str);

        System.out.println("Lowercase string: " + result);
    }

    public String toLowerCase(String str) {
        StringBuilder lowerStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                lowerStr.append((char) (ch + 32));
            } else {
                lowerStr.append(ch);
            }
        }
        return lowerStr.toString();
    }
}
