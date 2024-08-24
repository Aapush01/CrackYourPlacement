// 92. Reverse Linked List ll

import java.util.*;

public class ReverseLinkedListII{
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        
        ListNode dummy = new ListNode(0); // Create a dummy node
        dummy.next = head;
        ListNode prev = dummy;
        
        // Move `prev` to the node before the `left`-th node
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        
        ListNode start = prev.next; // The `left`-th node
        ListNode then = start.next; // The node after the `left`-th node
        
        // Reverse the sublist from `left` to `right`
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        
        return dummy.next;
    }
    public static void main(String[] args) {

    }
}