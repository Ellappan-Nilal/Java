package Interview_questions;
import java.util.Scanner;
public class SubstringRange {

    static String javaSub(String S, int L, int R) {
        
        String result = "";
        
        for(int i = L; i <= R; i++) {
            result = result + S.charAt(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String S = sc.nextLine();
        
        // Input L and R
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        // Call function
        String output = javaSub(S, L, R);
        
        // Print result
        System.out.println(output);
    }
}
