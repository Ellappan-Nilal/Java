public class TwoStringsareAlmostEquivalent {
    public static void main(String[] args){
        TwoStringsareAlmostEquivalent obj = new TwoStringsareAlmostEquivalent();

        String s1 = "abcdeef";
        String s2 = "abaaacc";

        boolean result = obj.checkAlmostEquivalent(s1, s2);

        System.out.println("Are the two strings almost equivalent? " + result);
    }
    public boolean checkAlmostEquivalent(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            count2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(count1[i] - count2[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}
