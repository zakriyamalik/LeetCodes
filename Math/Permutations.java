package Math;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> combos = new ArrayList<>();

    public List<List<Integer>> permute(int[] arr) {
        if (arr.length == 0) return combos; // Handle edge case for empty array

        // Base case for recursion
        if (arr.length == 1) {
            List<Integer> sub = new ArrayList<>();
            sub.add(arr[0]);
            combos.add(sub);
            return combos;
        }

        // Generate permutations
        generatePermutations(arr, 0);
        return combos;
    }

    private void generatePermutations(int[] arr, int start) {
        if (start == arr.length) {
            // Add a new permutation
            List<Integer> sub = new ArrayList<>();
            for (int num : arr) {
                sub.add(num);
            }
            combos.add(sub);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);           // Swap current element with start
            generatePermutations(arr, start + 1); // Recurse on the rest
            swap(arr, start, i);           // Backtrack (restore array)
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        int[] arr = {5,4,6,2};
        List<List<Integer>> result = permutations.permute(arr);

        System.out.println("Math.Permutations:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
