import java.util.Scanner;

public class n_square_series {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;

            for (int j = 0; j < n; j++) {
                int powerOf2 = 1;  
                for (int k = 0; k < j; k++) {
                    powerOf2 *= 2;
                }
                result += b * powerOf2;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
