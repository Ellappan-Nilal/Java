package DSA.Scalar.Binary_search;

public class RotatedSortedArraySearch {

    public static int search(int[] A, int B) {
        int left = 0, right = A.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

           
            if (A[mid] == B) return mid;

           
            if (A[left] <= A[mid]) {
                
                if (B >= A[left] && B < A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
          
            else {
               
                if (B > A[mid] && B <= A[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] A1 = {4, 5, 6, 7, 0, 1, 2, 3};
        int B1 = 4;
        System.out.println(search(A1, B1)); 

        int[] A2 = {9, 10, 3, 5, 6, 8};
        int B2 = 5;
        System.out.println(search(A2, B2)); 
    }
}