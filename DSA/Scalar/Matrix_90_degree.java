
package solve_problems.DSA.Scalar;

public class Matrix_90_degree {
    
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate90(arr);
        print(arr);
    }
    public static void print(int[][] arr){
        for(int[] a:arr){
            for(int val:a){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    public static void rotate90(int[][] arr){
        //transpose
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //swap column
        int left=0, right=arr[0].length-1;
        while(left<right){
            for(int i=0;i<arr.length;i++){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
            }
            left++;
            right--;
        }
    }
}
