
package solve_problems.DSA.Scalar.Binary_search;

import java.util.Scanner;

public class Search_Sorted_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr={{1,4,6,8,10},
            {2,7,9,12,15},{3,11,20,22,24},{5,16,25,30,40}
        };
        int tar=sc.nextInt();
        System.out.print(SearchMatrix(arr,tar));
    }

    private static boolean SearchMatrix(int[][] arr, int tar) {
        int i=0,  j=arr.length-1;
        while(i<arr.length&&j>=0){
            if(arr[i][j]==tar){
                return true;
            }else if(arr[i][j]<tar){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
