package DSA.Scalar;

public class PrintAllPermutations {
    public static void main(String[] args){
        int[] arr={1,2,3};
        printPermutation(arr,0,new boolean[arr.length],new ArrayList<>());
    }
}