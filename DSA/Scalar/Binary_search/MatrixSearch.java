package DSA.Scalar.Binary_search;

public class MatrixSearch {
    public static int searchMatrix(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        int left = 0, right = n * m - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / m;
            int col = mid % m;

            if (A[row][col] == B) return 1;
            else if (A[row][col] < B) left = mid + 1;
            else right = mid - 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] A1 = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        System.out.println(searchMatrix(A1, 3)); 

        int[][] A2 = {
            {5, 17, 100, 111},
            {119, 120, 127, 131}
        };
        System.out.println(searchMatrix(A2, 3)); 
    }
}