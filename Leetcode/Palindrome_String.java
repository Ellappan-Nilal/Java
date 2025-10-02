public class Palindrome_String{
  public static void main(String[] args){
    String str="Level";
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
      rev=rev+str.charAt(i);
    }
    if(str.toLowercase().equals(rev.toowerCase())){
      System.out.println("Palindrome String");
    }
    else{
      System.out.println("Not palindrome");
    }
  }
}





