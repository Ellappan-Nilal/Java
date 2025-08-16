import java.util.Arrays;
import java.util.Scanner;
public class First_and_Second_max_add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        Arrays.sort(arr); 

        int firstMax = arr[arr.length - 1];
        int secondMax = arr[arr.length - 2]; 
        
         secondMax = arr[arr.length - 1]; 
         for (int i = arr.length - 2; i >= 0; i--) {
             if (arr[i] < firstMax) {
                 secondMax = arr[i];
                 break;
            }
         }
        int sum = firstMax + secondMax;

        System.out.println("First maximum number: " + firstMax);
        System.out.println("Second maximum number: " + secondMax);
        System.out.println("Sum of first and second maximum numbers: " + sum);
    }
}    

