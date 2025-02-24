import java.util.Scanner;
import java.util.Stack;
public class Valid_parentheses {
    public static boolean isValid(String s){
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack =new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((c==')'&& top!='(')||
                   (c=='}'&& top!='{')||
                    (c==']'&& top!='[')){
                    return false;
            }    
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string Containing parentheses :");
         String in=sc.nextLine();
         boolean isValid = isValid(in);
         System.out.println(" The String "+in+" is "+(isValid ? "ture" : "false"));
         sc.close();
    }
}
