package CrackYourPlacement.Easy;

class Node {
    int data;
    Node next;
 
   Node(int data) {
       this.data = data;
   }
 }

public class DeleteNodesHavingGreaterValueOnRight {
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while( curr != null ) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    Node compute(Node head) {
        // your code here
        //Reverse the linked list
        head = reverse(head);
        //Traverse the reversed list and delete nodes
        Node curr = head;
        Node maxNode = head;
        
        while(curr != null && curr.next != null) {
            if(curr.next.data < maxNode.data) {
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
                maxNode = curr;
            }
        }
        //Reverse the list again to restore the original order
        head = reverse(head);
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(5);
        
    }
}
