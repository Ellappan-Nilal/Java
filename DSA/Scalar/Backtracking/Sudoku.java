package solve_problems.DSA.Scalar.Backtracking;

public class Sudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        solvesudoku(board);
    }

    public static void solvesudoku(char[][] arr) {
        if (sudokuSolve(arr, 0, 0)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static boolean sudokuSolve(char[][] arr, int x, int y) {
        if (x == 9) return true;

        int nx = (y == 8) ? x + 1 : x;
        int ny = (y == 8) ? 0 : y + 1;

        if (arr[x][y] != '.') {
            return sudokuSolve(arr, nx, ny);
        }

        for (int val = 1; val <= 9; val++) {
            if (canWePlace(arr, x, y, val)) {
                arr[x][y] = (char) (val + '0');

                if (sudokuSolve(arr, nx, ny))
                    return true;

                arr[x][y] = '.';
            }
        }

        return false;
    }
    public static boolean canWePlace(char[][] arr, int x, int y, int val) {
        char ch = (char) (val + '0');
        // Check row
        for (int j = 0; j < 9; j++) {
            if (arr[x][j] == ch) return false;
        }
        // Check column
        for (int i = 0; i < 9; i++) {
            if (arr[i][y] == ch) return false;
        }
        // Check 3×3 box    
        int sx = (x / 3) * 3;
        int sy = (y / 3) * 3;

        for (int i = sx; i < sx + 3; i++) {
            for (int j = sy; j < sy + 3; j++) {
                if (arr[i][j] == ch) return false;
            }
        }

        return true;
    }
}
