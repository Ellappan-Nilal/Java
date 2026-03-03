import java.util.Scanner;

class EvenIndex {
    static String evenIndex(String s) {
        
        String result = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                result = result + s.charAt(i);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String s = sc.nextLine();
        
        // Call function
        String output = evenIndex(s);
        
        // Print result
        System.out.println(output);
    }
}