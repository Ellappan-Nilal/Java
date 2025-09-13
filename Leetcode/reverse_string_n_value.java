
package solve_problems.Leetcode;

public class reverse_string_n_value {
    class Solution {
    public String reverseStr(String s, int k) {
        char[] array=s.toCharArray();
        for(int i=0;i<s.length();i=i+(2*k)){
            int start=i;
            int end=Math.min(i+k,s.length())-1;
            char temp;
            while(start<end){
                temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                start++;
                end--;
            }
        }
        return new String(array);
    }
}
}
