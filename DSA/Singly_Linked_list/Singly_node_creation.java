
import solve_problems.DSA.Singly_Linked_list.LinkedList;

/*One method
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    
}
        
public class Singly_node_creation {
    public static void main(String args[]){
        Node head=null,tail=null;
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        for(int i=0;i<n;i++){
            int v=x.nextInt();
            Node nn=new Node(v);
            if(head==null){
                head=nn;
                tail=nn;
            }
            else{
                tail.next=nn;
                tail=nn;
            }
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
            
}
*/
//import java.util.LinkedList;//innuild method package
public class Singly_node_creation{
    public static void main(String[] args){
        LinkedList nums=new LinkedList();
        nums.add(5);
        nums.add(9);
        nums.add(6);
        nums.printValues();
    }
            
}