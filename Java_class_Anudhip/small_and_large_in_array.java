package solve_problems.Java_class_Anudhip;
public class small_and_large_in_array {
    public static void main(String[] args) {
        int[] arr = {25, 10, 45, 5, 30};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}    

