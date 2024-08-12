import java.util.*;
//160. Intersection of Two Linked Lists

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
          return null;
      }

      ListNode pA = headA;
      ListNode pB = headB; 
      while (pA != pB) { 
          pA = (pA == null) ? headB : pA.next;
          pB = (pB == null) ? headA : pB.next;
      } 
      return pA;
  }
    public static void main(String[] args) {
        
    }
}
