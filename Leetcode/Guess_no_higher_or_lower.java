
package solve_problems.Leetcode;

public class Guess_no_higher_or_lower {
    public static void main(String[] args){
        
    }
    public class Solution extends guessgame{
        public int guessno(int n){
            int start=1;
            int end=n;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(guess(mid)==0){
                    return mid;
                }else if(guess(mid)==1){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            return -1;
        }
    }
}
