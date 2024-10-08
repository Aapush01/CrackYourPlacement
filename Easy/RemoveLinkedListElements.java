import java.util.*;
//203. Remove Linked List Elements

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy; 

        while (current.next != null) {
            if (current.next.val == val) { 
                current.next = current.next.next;
            } else { 
                current = current.next;
            }
        } 
        return dummy.next;
    }
    public static void main(Stirng[] args) {

    }
}
