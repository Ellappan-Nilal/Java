package String_programming;

public class ChecktheSentenceisPangram {
    public static  void main(String[] args){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        if(set.size()==26){
            System.out.println("true"); 
        }
        return false;
    }
}
