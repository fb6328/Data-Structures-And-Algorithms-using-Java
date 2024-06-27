/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lists;

/**
 *
 * @author fbarasa
 */
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList of String
        List<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");

        // Accessing elements
        System.out.println("First element: " + linkedList.get(0)); // Output: Dog

        // Iterating over elements
        System.out.println("Elements in LinkedList:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }

        // Modifying elements
        linkedList.set(1, "Eagle");

        // Removing elements
        linkedList.remove("Frog");

        // Final state of the list
        System.out.println("Final LinkedList: " + linkedList);
    }
}
