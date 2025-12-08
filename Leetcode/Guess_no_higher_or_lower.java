package solve_problems.Leetcode;

public class Guess_no_higher_or_lower {

    
    static class GuessGame {
        int pick = 6; 

        
        int guess(int num) {
            if (num == pick) return 0;
            else if (num > pick) return -1;
            else return 1;
        }
    }

    
    static class Solution extends GuessGame {

        public int guessNumber(int n) {
            int start = 1;
            int end = n;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                int res = guess(mid);

                if (res == 0) {
                    return mid;
                } else if (res == 1) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;

        int guessedNumber = solution.guessNumber(n);
        System.out.println("Guessed Number: " + guessedNumber);
    }
}
