package String_programming;

public class IsSubsequence1 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int pointerS = 0;
        int pointerT = 0;

        while (pointerS < s.length() && pointerT < t.length()) {
            if (s.charAt(pointerS) == t.charAt(pointerT)) {
                pointerS++;
            }
            pointerT++;
        }

        return pointerS == s.length();
    }
}
