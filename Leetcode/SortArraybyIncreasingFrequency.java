public class SortArraybyIncreasingFrequency {
    public static void main(String[] args){

    }
    public int[] frequencySort(int[] nums){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
    }
}
