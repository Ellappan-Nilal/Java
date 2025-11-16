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
public static boolean isSafe(char[][] arr,int row,int col){
    for(int i=0;i<row;i++){
        if(arr[i][col]=='Q'){
            return false;
        }
    }
    //checking diagonal 1
    for(int i=row-1,j=col+1;i>=0&&j<arr[0].length;i--,j++){
        if(arr[i][j]=='Q'){
            return false;
        }
    }
    //checking diagonal 2
     for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
        if(arr[i][j]=='Q'){
            return false;
        }
    }
}
public static void print(char[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.println(arr[i][j]+" ");
        }
        System.out.println();
    }
}
public static void nQueens (char[] [] arr, int row){
   if(row==arr.length){
       //decide for every row
       print(arr);
       return ;
   }
    for(int col=0;col<arr[0].length;col++) {
       if(isSafe(arr,row,col)==true){
           arr[row][col]='Q';
           nQueens(arr,row+1);
           arr[row][col]='.';
       }
   }
}

}