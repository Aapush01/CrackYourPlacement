import java.util.*;
//206. Reverse Linked List

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while( curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }
        head = prev;
        return head;
    }
    public static void main(String[] args) {
        
    }
}
