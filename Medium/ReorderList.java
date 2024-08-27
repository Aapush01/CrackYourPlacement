
//143. Reorder List
import java.util.*;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = getMidNode(head);
        ListNode head2 = reverseList(mid.next);
        mid.next = null;

        // Merge the two halves
        mergeLists(head, head2);
    }

    private ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private void mergeLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;

            l1.next = l2;
            if (l1Next == null) {
                break;
            }
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
    }

    public static void main(String[] args) {

    }
}