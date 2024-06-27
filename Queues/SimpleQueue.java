/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queues;
/**
 *
 * @author fbarasa
 */
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue operations
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Dequeue operations
        System.out.println("Dequeued: " + queue.remove()); //deletes 1

        // Peek operation
        System.out.println("Front element: " + queue.peek()); // Front element is now 2

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); //False

        // Size of the queue
        System.out.println("Queue size: " + queue.size()); // Number of elements is 2
    }
}
