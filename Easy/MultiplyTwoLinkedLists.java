package CrackYourPlacement.Easy;
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}
public class MultiplyTwoLinkedLists {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long num1 = 0, num2 = 0;
        long MOD = 1000000007;

        // Convert first linked list to a number
        while (first != null) {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }

        // Convert second linked list to a number
        while (second != null) {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }

        return (num1 * num2) % MOD;
    }
    public static void main(String[] args) {
        
    }
}
