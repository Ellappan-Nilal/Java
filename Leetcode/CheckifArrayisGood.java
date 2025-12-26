import java.util.Arrays;

public class CheckifArrayisGood {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        boolean result = isGoodArray(arr);
        System.out.println("Is the array good? " + result);
    }

    public static boolean isGoodArray(int[] arr) {
        Arrays.sort(arr);
        int max = arr.length - 1;

        int[] expected = new int[max + 1];
        int n = expected.length;
        for (int i = 0; i < n; i++) {
            expected[i] = i + 1;
        }
        expected[n - 1] = max;
        
        return Arrays.equals(arr, expected);
    }   
}