package String_programming;

import java.util.*;

public class RemoveAllAdjacentDuplicate {

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicate obj = new RemoveAllAdjacentDuplicate();

        String input = "abbaca";
        String result = obj.removeDuplicate(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    public String removeDuplicate(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // remove adjacent duplicate
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
