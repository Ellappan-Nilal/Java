package solve_problems.Leetcode;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Linkedlistcycle {

    public static void main(String[] args) {

        
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        
        head.next = second;
        second.next = third;
        third.next = fourth;

       
        fourth.next = second; // cycle here

        Linkedlistcycle obj = new Linkedlistcycle();
        boolean result = obj.hasCycle(head);

        System.out.println("Does the linked list have a cycle? " + result);
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        // Floyd’s Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next;  

            if (slow == fast) {     
                return true;
            }
        }

        return false; 
    }
}
