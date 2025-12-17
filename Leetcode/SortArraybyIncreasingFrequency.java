import java.util.*;

public class SortArraybyIncreasingFrequency {

    public static void main(String[] args) {
        SortArraybyIncreasingFrequency obj = new SortArraybyIncreasingFrequency();

      
        int[] nums = {1, 1, 2, 2, 2, 3};

       
        int[] result = obj.frequencySort(nums);

       
        System.out.println("Sorted Array by Increasing Frequency:");
        System.out.println(Arrays.toString(result));
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

 
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return b - a; 
            } else {
                return map.get(a) - map.get(b);
            }
        });

        
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : list) {
            for (int i = 0; i < map.get(num); i++) {
                result[index++] = num;
            }
        }

        return result;
    }
}
