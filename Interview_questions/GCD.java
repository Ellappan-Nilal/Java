package Interview_questions;

public class GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
