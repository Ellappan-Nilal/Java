import java.util.Scanner;

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        long left = 1;
        long right = x;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }

        return (int) result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int input = scanner.nextInt();

        Solution solution = new Solution();
        int sqrt = solution.mySqrt(input);

        System.out.println("Square root (rounded down): " + sqrt);
        scanner.close();
    }
}