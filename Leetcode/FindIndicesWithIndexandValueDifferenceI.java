public class FindIndicesWithIndexandValueDifferenceI {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 7};
        int k = 3;
        int count = findIndicesWithIndexAndValueDifference(arr, k);
        System.out.println("Count of valid indices: " + count);
    }

    public static int findIndicesWithIndexAndValueDifference(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Math.abs(i - j) == k && Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
