
package solve_problems.DSA.Singly_Linked_list;

public class Selection_sort {

    public static void main(String[] args) {
        int nums[] = {4, 3, 6, 9, 8};
        int size = nums.length;
        int temp = 0;
        int midIndex = -1;
        System.out.print("Before sorting ");
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < size - 1; i++) {
            midIndex = i;
            for (int j = i+1; j < size; j++) {
                if (nums[midIndex] > nums[j]) {
                    midIndex = j;
                }
            }
            temp = nums[midIndex];
            nums[midIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
