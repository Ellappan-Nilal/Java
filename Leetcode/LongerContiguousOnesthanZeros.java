public class LongerContiguousOnesthanZeros {
    public static void main(String[] args){
        int[] nums = {1101, 1110, 0011, 0000};
        System.out.print(longerContiguousOnesThanZeros(nums));
    }
    public static boolean longerContiguousOnesThanZeros(int[] nums) {
        for (int num : nums) {
            String binaryString = Integer.toBinaryString(num);
            int maxOnes = 0, maxZeros = 0;
            int currentOnes = 0, currentZeros = 0;

            for (char bit : binaryString.toCharArray()) {
                if (bit == '1') {
                    currentOnes++;
                    maxOnes = Math.max(maxOnes, currentOnes);
                    currentZeros = 0;
                } else {
                    currentZeros++;
                    maxZeros = Math.max(maxZeros, currentZeros);
                    currentOnes = 0;
                }
            }

            if (maxZeros >= maxOnes) {
                return false;
            }
        }
        return true;
    }
}
