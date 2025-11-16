import java.util.*;
public class Main{
public static void main(String[] args) { 
    int n=4;
    char[][] arr=new char[n][n];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j]='.';
        }
    }
    nQueens(arr,0);
}
public static void print Permutations (int[] arr, int pos, boolean[] selected, ArrayList<Integer> ans) { -
}
public static void tss (int () arr, int i, int target, ArrayList<Integer> ans){-
}
public static void nQueens (char[] [] arr, int row){
   for(int col=0;col<arr[0].length;col++) {
       if(isSafe(arr,row,col)==true){
           arr[row][col]='Q';
           nQueens(arr,row+1);
           arr[row][col]='.';
       }
   }
}

}