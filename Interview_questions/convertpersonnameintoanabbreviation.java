package Interview_questions;

public class convertpersonnameintoanabbreviation {
   
    public static String getIntial(String fullname){
        if(fullname==null||fullname.isEmpty()){
            return "";
        }
        StringBuilder initials=new StringBuilder();
        String[] words=fullname.split("\\s+");
        for(String word:words){
            if(!word.isEmpty()){
                 initials.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return initials.toString();
    }
    
    public static void main(String[] args) {
       String name="Time For Information";
       System.out.println(getIntial(name));
    }
}

