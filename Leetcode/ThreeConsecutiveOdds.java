public class ThreeConsecutiveOdds {

    public static void main(String[] args) {
        ThreeConsecutiveOdds obj = new ThreeConsecutiveOdds();
        
        int[] arr = {2, 6, 4, 1, 3, 5};
        
        boolean result = obj.ConsecutiveOdds(arr);
     
        System.out.println("Contains three consecutive odds: " + result);
    }

    public boolean ConsecutiveOdds(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            } else {
                count = 0;
            }

            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}
