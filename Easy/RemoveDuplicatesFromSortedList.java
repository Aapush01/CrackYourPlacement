import java.util.*;

//83. Remove Duplicates from Sorted List

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) { 
      if (head == null || head.next == null) {
          return head;
      }
      
      // Initialize the current node to the head of the list
      ListNode current = head;
      
      // Traverse the list
      while (current != null && current.next != null) { 
          if (current.val == current.next.val) { 
              current.next = current.next.next;
          } else { 
              current = current.next;
          }
      } 
      return head;
  }
 public static void main(String[] args) {
    
 }   
}
