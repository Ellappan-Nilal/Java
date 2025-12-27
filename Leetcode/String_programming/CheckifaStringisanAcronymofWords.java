package String_programming;

public class CheckifaStringisanAcronymofWords {
    public static void main(String[] args) {
        String[] words = {"Portable", "Network", "Graphics"};
        String s = "PNG";
        boolean result = isAcronym(words, s);
        System.out.println("Is the string an acronym? " + result);
    }

    public static boolean isAcronym(String[] words, String s) {
        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(word.charAt(0));
            }
        }
        return acronym.toString().equals(s);
    }
}
