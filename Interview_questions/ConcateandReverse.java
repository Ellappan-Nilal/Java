import java.util.Scanner;
public class ConcateandReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String concatenated = str1 + str2;
        String reversed = new StringBuilder(concatenated).reverse().toString();

        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Reversed Concatenated String: " + reversed);

        sc.close();
    }
}
