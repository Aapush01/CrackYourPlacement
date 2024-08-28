// 19. Remove Nth Node from end of List
import java.util.*;
public class RemoveNthNodeFromEndofList{
    public ListNode removeNthFromEnd(ListNode head, int n) {
         public ListNode removeNthFromEnd(ListNode head, int n) {
            int size = 0;
            ListNode temp = head;
     
            while (temp != null) {
                temp = temp.next;
                size++;
            }
        
            if (n == size) {
                head = head.next;
                return head;
            }
        
            int i = 1;
            int toFind = size - n;
            ListNode prev = head;
      
            while (i < toFind) {
                prev = prev.next;
                i++;
            }
        
            prev.next = prev.next.next;
         
            return head;
         }
    }
    public static void main(String[] args) {

    }
}