import java.util.Arrays;
public class Longest_Common_Prefix {
    public static void main(String[] args){
        String s[]={"flower","flow","flight"};
        Arrays.sort(s);
        String s1=s[0];
        String s2=s[s.length-1];
        String op="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                op=op+s1.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println(op);
    }
}
