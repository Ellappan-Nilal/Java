public class CheckifArrayisGood {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        boolean result = isGoodArray(arr);
        System.out.println("Is the array good? " + result);
    }

    public static boolean isGoodArray(int[] arr) {
        int n = arr.length;
        boolean[] seen = new boolean[n + 1];

        for (int num : arr) {
            if (num <= n) {
                seen[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                return false;
            }
        }

        return true;
    }   
}
