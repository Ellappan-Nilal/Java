package solve_problems.Java_class_Anudhip;
public class print_duplicate {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Duplicate characters:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != i) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(ch);
            }
        }
    }
}    

