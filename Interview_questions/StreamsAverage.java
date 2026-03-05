package Interview_questions;

public class StreamsAverage {
public static double findAverage(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        double avg = findAverage(arr);
        System.out.println(avg);
    }
}
