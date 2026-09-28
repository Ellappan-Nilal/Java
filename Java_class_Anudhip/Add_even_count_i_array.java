package solve_problems.Java_class_Anudhip;
public class Add_even_count_i_array {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 33, 40, 51};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}
