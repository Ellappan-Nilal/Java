
package solve_problems.Leetcode;
public class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
    ListNode(int val.ListNode next){this.val=val;this.next=next; }
}
public class MiddleoftheLinkedlist {
    public static void main(String[] args){
        
    }
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fas.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
    }
}
