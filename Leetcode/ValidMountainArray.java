package solve_problems.Leetcode;
public class ValidMountainArray {
    public static void main(String[] args){
        ValidMountainArray obj=new ValidMountainArray();
        int[] arr={0,3,2,1};
        boolean result=obj.validMountainArray(arr);
        System.out.println("Is valid mountain array: "+result);      

    }
    public boolean validMountainArray(int[] arr){
        int len=arr.length;
        if(len<3){
            return false;
        }
        int i=0,j=len-1;
        while(i+1<len&&arr[i]<arr[i+1]){
            i++;
        }
        while(j>0&&arr[j-1]>arr[j]){
            j--;
        }
        if(i>0&&j<len-1){
            if(i==j){
                return true;
            }
        }
        return false;
    }
}
