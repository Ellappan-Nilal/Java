package solve_problems.Java_class_Anudhip;
public class Passwordcheck {
    public static void main(String[] args) {
        String password = "Java@123";
        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean special = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercase = true;
            }
            else if (Character.isLowerCase(ch)) {
                lowercase = true;
            }
            else if (Character.isDigit(ch)) {
                digit = true;
            }
            else {
                special = true;
            }
        }
        if (uppercase && lowercase && digit && special) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}    

