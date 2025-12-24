package String_programming;

public class CountIntegerswithEvenDigitSum {
    public static void main(String[] args){
        int low = 30;
        int high = 45;

        int result = countEven(low, high);

        System.out.println("Count of integers with even digit sum between " + low + " and " + high + ": " + result);
    }

    public static int countEven(int low, int high) {
        int count = 0;

        for (int num = low; num <= high; num++) {
            if (isDigitSumEven(num)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isDigitSumEven(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum % 2 == 0;
    }
}
