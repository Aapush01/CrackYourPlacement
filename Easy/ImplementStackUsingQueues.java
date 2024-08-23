//225. Implement Stack using Queues
import java.util.*;
public class ImplementStackUsingQueues {
     // Use a single queue to simulate the stack
     private Queue<Integer> queue;

     // Constructor
     public MyStack() {
         queue = new LinkedList<>();
     }
 
     // Push element x onto the stack
     public void push(int x) {
         queue.add(x);
         // Rotate the queue to make the last added element the front of the queue
         for (int i = 1; i < queue.size(); i++) {
             queue.add(queue.remove());
         }
     }
 
     // Removes the element on the top of the stack and returns that element
     public int pop() {
         return queue.remove();
     }
 
     // Get the top element
     public int top() {
         return queue.peek();
     }
 
     // Returns whether the stack is empty
     public boolean empty() {
         return queue.isEmpty();
     }
    public static void main(String[] args) {

    }
}