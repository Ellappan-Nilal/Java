public class containsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
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
