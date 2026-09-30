package solve_problems.Java_class_Anudhip;
public class Odd_Even_count {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even elements = " + even);
        System.out.println("Odd elements = " + odd);
    }
}    

