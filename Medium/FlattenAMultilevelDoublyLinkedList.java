// 430. Flatten a Multilevel Doubly Linked List

import java.util.Stack;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

public class FlattenAMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        if (head == null)
            return head;

        Node dummy = new Node(0, null, head, null);
        Node curr = dummy;
        Node prev = dummy;
        Stack<Node> stack = new Stack<>();
        stack.push(head);

        while (!stack.isEmpty()) {
            curr = stack.pop();
            prev.next = curr;
            curr.prev = prev;

            if (curr.next != null) {
                stack.push(curr.next);
            }
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null; //Remove the child reference
            }

            prev = curr;
        }

        dummy.next.prev = null; // Detach the dummy node
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}