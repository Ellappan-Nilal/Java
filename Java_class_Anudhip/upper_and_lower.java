package solve_problems.Java_class_Anudhip;
public class upper_and_lower {
    public static void main(String[] args) {
        String str = "Java Programming";
        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercase++;
            } 
            else if (Character.isLowerCase(ch)) {
                lowercase++;
            }
        }
        System.out.println("Uppercase letters: " + uppercase);
        System.out.println("Lowercase letters: " + lowercase);
    }
}    

