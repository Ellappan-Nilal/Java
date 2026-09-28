package solve_problems.Java_class_Anudhip;
public class Duplicate_in_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        int[] unique = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                unique[count] = arr[i];
                count++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.println(unique[i]);
        }
    }
}
