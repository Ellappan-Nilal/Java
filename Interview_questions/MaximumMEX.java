import java.util.*;

public class MaximumMEX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> answer = new ArrayList<>();

        int start = 0;
        while (start < n) {
            // Find MEX of remaining array
            boolean[] present = new boolean[n + 1];

            for (int i = start; i < n; i++) {
                if (a[i] >= 0 && a[i] <= n) {
                    present[a[i]] = true;
                }
            }

            int mex = 0;

            while (mex <= n && present[mex]) {
                mex++;
            }

            // Find shortest prefix having this MEX
            boolean[] seen = new boolean[n + 1];

            int count = 0;

            for (int i = start; i < n; i++) {

                if (a[i] >= 0 && a[i] <= n) {
                    seen[a[i]] = true;
                }

                while (count < mex && seen[count]) {
                    count++;
                }

                if (count == mex) {

                    answer.add(mex);

                    start = i + 1;

                    break;
                }
            }
        }

        // Print number of elements in b
        System.out.println(answer.size());

        // Print b
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i));

            if (i < answer.size() - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();

        sc.close();
    }
}