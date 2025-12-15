public class RunningSumof1darray {
    public static void main(String[] args){

    }
    public int[] runningSum(int[] nums){
        for(int i=0;i<=nums.length;i++){
            sum=nums[i]+nums[i-1];
            nums[i]=sum;
        }
        return nums;
    }
}
