import java.util.*;

public class Nqueens {

    public static void main(String[] args) {
        int n = 4;
        char[][] arr = new char[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '.';
            }
        }
        nQueens(arr, 0);
    }

    public static boolean isSafe(char[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 'Q') return false;
        }
        // diagonal right-up
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') return false;
        }
        // diagonal left-up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') return false;
        }
        return true;
    }

    public static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " "); // <-- FIXED
            }
            System.out.println(); // <-- print next row
        }
    }

    public static void nQueens(char[][] arr, int row) {
        if (row == arr.length) {
            print(arr);
            System.out.println("====");
            return;
        }

        for (int col = 0; col < arr[0].length; col++) {
            if (isSafe(arr, row, col)) {
                arr[row][col] = 'Q';
                nQueens(arr, row + 1);
                arr[row][col] = '.';
            }
        }
    }
}
