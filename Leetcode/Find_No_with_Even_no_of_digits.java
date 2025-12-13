public class Find_No_with_Even_no_of_digits {
    public static void main(String[] args){
        Find_No_with_Even_no_of_digits obj = new Find_No_with_Even_no_of_digits();

        int[] nums = {12, 345, 2, 6, 7896};
        int result = obj.findNo(nums);

        System.out.println("Count of numbers with even number of digits: " + result);
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
