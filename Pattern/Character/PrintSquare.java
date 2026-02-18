package Pattern.Character;

public class PrintSquare {
    
    public static void main(String[] args) {
        int size = 5; // Size of the square
        printSquare(size);
    }

    public static void printSquare(int n) {
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        
}
