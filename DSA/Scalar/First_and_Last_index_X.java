package solve_problems.DSA.Scalar;

public class First_and_Last_index_X {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 7,8, 9};
        postion(arr, 7);
    }

    public static void postion(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                first=mid;
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
            
        }
         left = 0;
        right = arr.length - 1;
        int last = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                last=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
            
        }
        System.out.println(first+" "+last);
    }
}


