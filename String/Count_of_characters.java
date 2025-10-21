public class Count_of_characters{
  public static void main(String[] args){
    String str="Hello World";
    int count=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)!=' '){
        count++;
      }
    }
    System.out.println("number of characters in a string are"+count);
  }
}


