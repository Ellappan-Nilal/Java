
package solve_problems.Leetcode;
public class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
    ListNode(int val,ListNode next){this.val=val;this.next=next;}
}
public class ReverseLinkedList {
    public static void main(String[] args){
        
    }
    public ListNode reverselist(ListNode head){
        if(head==null){
            return head;
        }
        ListNode previous=null;
        ListNode current=head;
        ListNode next=current.next;
        while(current!=null){
            current.next=previous;
            previous=current;
            current=next;
            if(next!=null){
                next=current.next;
            }
        }
        head=previous;
        return head;
    }
}
