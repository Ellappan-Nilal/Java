
package solve_problems.Leetcode.String_programming;

public class length_of_last_word {
    public static void main(String[] args){
        String s="fly of the moon";
        System.out.println(Lengthoflast(s));
    }
    static int Lengthoflast(String s){
        String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
