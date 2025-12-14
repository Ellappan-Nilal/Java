public class CountNegativeNumbersSortedMatrix {

    public static void main(String[] args) {
        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        CountNegativeNumbersSortedMatrix obj = new CountNegativeNumbersSortedMatrix();
        int result = obj.countNegative(grid);
        System.out.println("Count of negative numbers: " + result);
    }

    public int countNegative(int[][] grid) {
        int trows = grid.length;
        int tcols = grid[0].length;

        int row = 0, col = tcols - 1, count = 0;

        while (row < trows && col >= 0) {
            if (grid[row][col] < 0) {
                count += trows - row;
                col--;
            } else {
                row++;
            }
        }
        return count;
    }
}
