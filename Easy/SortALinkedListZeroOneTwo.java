// A linked list node
class Node {
    int data;
    Node next; 
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Function to sort a linked list of 0s, 1s and 2s
public class SortALinkedListZeroOneTwo {
  
    public static void sortList(Node head) {
      
        // Initialize count of '0', '1' and '2' as 0
        int[] cnt = { 0, 0, 0 };
        Node ptr = head;
        while (ptr != null) {
            cnt[ptr.data] += 1;
            ptr = ptr.next;
        }

        int idx = 0;
        ptr = head; 
        while (ptr != null) {
            if (cnt[idx] == 0)
                idx += 1;
            else {
                ptr.data = idx;
                cnt[idx] -= 1;
                ptr = ptr.next;
            }
        }
    } 
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
      
        // Create a hard-coded linked list:
        // 1 -> 1 -> 2 -> 1 -> 0 -> NULL
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);

        System.out.print("Linked List before Sorting:");
        printList(head);

        // Function to sort the linked list
        sortList(head);

        System.out.print("Linked List after Sorting:");
        printList(head);
    }
}
