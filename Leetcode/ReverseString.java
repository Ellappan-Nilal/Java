
package solve_problems.Leetcode;

public class ReverseString {
    public static void main(String[] args){
        
    }
    public void reverseString(char[] s){
        int start=0;
        int end=s.length-1;
        while(start<end){
            char ch=s[start];
            s[start]=s[end];
            s[end]=ch;
            start++;
            end--;
        }
                
    }
}
