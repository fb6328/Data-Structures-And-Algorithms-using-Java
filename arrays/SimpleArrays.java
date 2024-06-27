/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.*;

/**
 *
 * @author fbarasa
 */
public class SimpleArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Five whole number:");
        for (int i = 0; i < 5; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("You Entered the following Values into the Array");
        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index " + i + "=" + nums[i]);
        }
        int[] numbers = {5, 2, 8, 1, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 5, 8]
        
        //
        int[] largeArray = {5, 2, 8, 1, 3,4,5,6,5,
            6,67,8,9,1,23,45,54,65,77,87,34,56,89,100}; // assume this is a large array
        Arrays.parallelSort(largeArray);
        System.out.println(Arrays.toString(largeArray));

    }

}
