/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithms;

/**
 *
 * @author fbarasa
 */
import java.util.Arrays;

public class MergeSort {

    // Function to merge two subarrays of arr[]
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the two arrays into arr[]
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left[], if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right[], if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Function to implement Merge Sort
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // Base case: if the array is 1 or 0 elements, it is already sorted
        }

        int mid = arr.length / 2; //Divide the array into halves
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}

