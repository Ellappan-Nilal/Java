import java.util.HashMap;
import java.util.Map;
public class containsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && (i - map.get(nums[i])) <=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
    
    public static void main(String[] args) {
        containsNearbyDuplicate solution = new containsNearbyDuplicate();
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = solution.containsNearbyDuplicate(nums, k);
        System.out.println(result); // Output: true
    }
}
