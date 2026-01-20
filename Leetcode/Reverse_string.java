
package solve_problems.Leetcode;
public class Reverse_string {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        Reverse_string obj=new Reverse_string();
        char[] s={'h','e','l','l','o'};
        obj.reverseString(s);
        System.out.println(s);
    }
}



