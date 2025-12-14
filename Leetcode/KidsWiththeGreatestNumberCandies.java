import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberCandies {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        KidsWiththeGreatestNumberCandies obj = new KidsWiththeGreatestNumberCandies();
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);

        System.out.println(result);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;

        
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();

        
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
