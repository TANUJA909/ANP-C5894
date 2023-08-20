/*
Thursday Lab
Question 1: 
Write a Java program that demonstrates the usage of a Queue (LinkedList):
Enqueue a series of elements.
Dequeue elements from the Queue.
Print the elements after each dequeue operation.
*/
 
import java.util.LinkedList; // Import the LinkedList class
import java.util.Queue; // Import the Queue interface
 
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Create a Queue using LinkedList
 
        // Enqueue elements to the Queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
 
        // Print initial elements in the Queue
        System.out.println("Initial elements in the Queue: " + queue);
 
        // Dequeue elements from the Queue
        int element1 = queue.poll();
        int element2 = queue.poll();
 
        // Print elements after the first two dequeue operations
        System.out.println("Elements after dequeue operations: " + queue);
 
        // Enqueue more elements
        queue.offer(40);
        queue.offer(50);
 
        // Print elements after enqueue operations
        System.out.println("Elements after enqueue operations: " + queue);
 
        // Dequeue one more element
        int element3 = queue.poll();
 
        // Print elements after the third dequeue operation
        System.out.println("Elements after the third dequeue operation: " + queue);
    }
}
