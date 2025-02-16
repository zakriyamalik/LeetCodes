package Sorting;

import java.util.Arrays;

public class SelectionSort {

    // Method to perform selection sort on the array A
    public static void selectionSort(int[] A) {
        int n = A.length;
        // Loop from 0 to n - 2
        for (int i = 0; i < n - 1; i++) {
            // Assume the element at index i is the minimum
            int minIndex = i;
            // Find the index of the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            // If the minimum element is not already at position i, swap them
            if (minIndex != i) {
                int temp = A[i];
                A[i] = A[minIndex];
                A[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(A));
        selectionSort(A);
        System.out.println("Sorted array: " + Arrays.toString(A));
    }
}
