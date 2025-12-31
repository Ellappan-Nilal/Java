public class ThreeDivisors {
    public static void main(String[] args) {
        int n = 9;
        boolean result = isThree(n);
        System.out.println("Result: " + result);
    }   
    public static boolean isThree(int n) {
        if (n < 4) {
            return false;
        }
        int sqrtN = (int) Math.sqrt(n);
        if (sqrtN * sqrtN != n) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sqrtN); i++) {
            if (sqrtN % i == 0) {
                return false;
            }
        }
        return true;
    }
}
