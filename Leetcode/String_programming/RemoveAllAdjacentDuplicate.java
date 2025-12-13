package String_programming;

public class RemoveAllAdjacentDuplicate {
    public static void main(String[] args){

    }
    public String removeDuplicate(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }else{
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
