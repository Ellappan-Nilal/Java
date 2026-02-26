public class SubstringSearch {
    public static void main(String[] args) {
        String str = "Hello, welcome to the world of Java programming!";
        String substring = "world";

        int index = str.indexOf(substring);
        
        if (index != -1) {
            System.out.println("Substring '" + substring + "' found at index: " + index);
        } else {
            System.out.println("Substring '" + substring + "' not found.");
        }
    }
}
