import java.util.*;

//1290. Convert Binary Number in a Linked List to Integer

public class ConvertBinaryNumberInALinkedListToInteger{
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while(head != null) {
          res *= 2;
          res += head.val;
          head = head.next;
        }  
        return res;
      }
    public static void main(String[] args) {

    }
}