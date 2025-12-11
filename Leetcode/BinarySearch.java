package solve_problems.Leetcode;

public class BinarySearch {

    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();

        int[] nums = {-5, -2, 0, 3, 7, 10, 12};
        int target = 7;

        int result = bs.search(nums, target);

        if(result != -1){
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }

    public int search(int[] nums, int target){
        int mid;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(target < nums[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
