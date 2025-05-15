//import java.util.Stack;in build method

public class StackImplement {
    public static void main(String[] args){
        Stack nums=new Stack();
        nums.push(3);
        nums.push(5);
        nums.push(38);
        System.out.println(nums.pop());
        nums.push(30);
        nums.push(35);
        System.out.println(nums.peak());
        nums.push(67);
        nums.printStack();
    }
}
