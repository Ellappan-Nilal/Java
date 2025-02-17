import java.util.*;
public class vowels_and_consonant_count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vc=0,cc=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vc++;
            }
            else if(ch!=' '){
                    cc++;
                }
        }
        System.out.println("Vowels :"+vc);
        System.out.println("Consonant :"+cc);

    }
}
