package solve_problems.Leetcode;

import java.util.ArrayList;
import java.util.List;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Palindrome_linkedlist {

    public static void main(String[] args) {

        // Example 1: [1,2,2,1] → true
        ListNode head1 = new ListNode(1,
                new ListNode(2,
                new ListNode(2,
                new ListNode(1))));

        Palindrome_linkedlist obj = new Palindrome_linkedlist();
        System.out.println(obj.isPalindrome(head1)); // true

        // Example 2: [1,2] → false
        ListNode head2 = new ListNode(1, new ListNode(2));
        System.out.println(obj.isPalindrome(head2)); // false
    }

    public boolean isPalindrome(ListNode head) {

        // Empty list or single node is palindrome
        if (head == null || head.next == null) {
            return true;
        }

        List<Integer> list = new ArrayList<>();
        ListNode current = head;

        // Store values in list
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        // Two-pointer check
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
