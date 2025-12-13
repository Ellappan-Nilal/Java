public class Find_No_with_Even_no_of_digits {
    public static void main(String[] args){

    }
    public int findNo(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int count =0;
        for(int i=0;i<nums.length;i++){
            int numsofDigits=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                numsofDigits++;
            }
            if(numsofDigits%2==0){
                count++;
            }
        }
        return count;
    }
}
