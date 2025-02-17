package solve_problems.Number_Series;

import java.util.Scanner;

public class Assending_or_Not {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isAscending = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isAscending = false;
                break; // No need to continue checking if we find a violation
            }
        }

        if (isAscending) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}