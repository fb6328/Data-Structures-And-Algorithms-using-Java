/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithms;

/**
 *
 * @author fbarasa
 */
public class BinarySearch {

    // Method/Algorithm to perform binary search on a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0; //First index in the array
        int right = arr.length - 1; //Last index in the array

        while (left <= right) {
            int mid = left + (right - left) / 2; //Determine the midpoint

            // Check if target is present at mid
            if (target == arr[mid]) { //Is 7 == 6
                return mid;  // Target found, return index
            }

            // If target is greater, ignore left half
            if (target > arr[mid]) { //Is 7 > 6
                left = mid + 1;
            } // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11, 32, 33, 53};
        int target = 7;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in array");
        }
    }
}
