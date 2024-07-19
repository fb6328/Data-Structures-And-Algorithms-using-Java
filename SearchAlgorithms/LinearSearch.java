/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithms;

/**
 *
 * @author fbarasa
 */
public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9}; //Data to be searched
        int target = 7; //Element to be searched
        if (linearSearch(array, target) == -1) {
            System.out.println("Index of target: " + linearSearch(array, target) + "\nTarget not found.");
        } else {
            System.out.println("Index of target: " + linearSearch(array, target) + "\nTarget found."); // Output: 2
        }
    }
}
