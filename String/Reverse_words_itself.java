import java.util.*;
public class Reverse_words_itself {
    public static String rever(String[] args){
        Scanner sc=new Scanner(System.in);
        String sen=sc.nextLine();
        String rev="";
        int i=0;
        for(i=sen.length()-1;i>=0;i--){
            rev=rev+sen.charAt(i);
            
        }
        return rev;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sent=sc.nextLine();
        String reve="";
        int i=0;
        while(i<sent.length()){
            String temp="";
            int c=i;
            while(c<sent.length()&&sent.charAt(c)!=' '){
                temp+=sent.charAt(c);
            }
            String r=rever(temp);
            reve+=r;
            if(c<sent.length()){
                reve+=" ";
            }
            i=c+1;
        }
        System.out.print(reve);
    }
}
