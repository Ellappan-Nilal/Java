
package solve_problems.Leetcode;

public class CountingBits {
    public static void main(String[] args){
        
    }
    public int[] countBits(int n){
        int ans[] =new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            String binary=Integer.toBinaryString(i);
            int one_count=countOnes(binary);
            int[i]=one_count;
        }
    }
    private int countOnes(String num){
        int count=0;
        for(int i=0;i<num.length();i++){
            int count=0;
            for(int i=0;i<num.length();i++){
                if(num.charAt(i)=='1'){
                    count++;
                }
            }
            return count;
        }
    }
}
