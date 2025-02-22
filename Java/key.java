import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1; // Start counting from 1

        // Read lines until EOF
        while (sc.hasNext()) {
            String line = sc.nextLine(); // Read the current line
            System.out.println(lineNumber + " " + line); // Print the line number and content
            lineNumber++; // Increment line number for the next line
        }

        sc.close(); // Close the scanner when done
    }
}
