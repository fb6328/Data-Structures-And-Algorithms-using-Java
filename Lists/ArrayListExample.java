/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fbarasa
 */
public class ArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayListExample of String
        List<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing elements
        System.out.println("First element: " + arrayList.get(0)); // Output: Apple

        // Iterating over elements
        System.out.println("Elements in ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Modifying elements
        arrayList.set(1, "Blueberry");

        // Removing elements
        arrayList.remove("Cherry");

        // Final state of the list
        System.out.println("Final ArrayList: " + arrayList);
        System.out.println("Final ArrayList has "+arrayList.size()+" elements");
    }

}
