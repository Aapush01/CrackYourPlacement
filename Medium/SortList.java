// 148. Sort List
import java.util.*;

//Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class SortList {
    public int[] linkedListToArray(ListNode head) {
         
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
      
        int[] array = new int[size];
       
        current = head;
        int index = 0;
        while (current != null) {
            array[index] = current.val;
            index++;
            current = current.next;
        }
      
        return array;
    }
    public ListNode arrayToLinkedList(int[] array) {
        if (array == null || array.length == 0) {
            return null;  
        }
     
        ListNode head = new ListNode(array[0]);
     
        ListNode current = head;
        for (int i = 1; i < array.length; i++) {

            current.next = new ListNode(array[i]);
            current = current.next;
        }
 
        return head;
    }
        public ListNode sortList(ListNode head) {
            int[] arrTemp = linkedListToArray(head);
            Arrays.sort(arrTemp);
            ListNode ans = arrayToLinkedList(arrTemp);
            return ans;
    
        }
    public static void main(String[] args) {
        
    }
}
