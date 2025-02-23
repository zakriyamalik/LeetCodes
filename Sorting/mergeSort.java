//startackage Sorting;
//
//public class mergeSort {
//    public static int[] mergeSort(int[] A, int p, int end) {
//        if(p>=r)
//        {
//            return A;
//        }
//        int q=(p+r)/2;
//        mergeSort(A,p,q);
//        mergeSort(A,q+1,r);
//        merge(A,p,q,r);
//        return A;
//
//    }
//
//    private static void merge(int[] a, int p, int q, int r) {
//        int leftSize=q-p+1;
//        int rightSize=r-q;
//        int[] left = new int[leftSize + 1];
//        int[] right = new int[rightSize + 1];
//        for (int i = 0; i < leftSize; i++) {
//            left[i] = a[p + i];
//        }
//        left[leftSize] = Integer.MAX_VALUE;
//        for (int j = 0; j < rightSize; j++) {
//            right[j] = a[q + 1 + j];
//        }
//        right[rightSize] = Integer.MAX_VALUE;
//        int i = 0, j = 0, k = p;
//        while (i < leftSize && j < rightSize) {
//            if (left[i] <= right[j]) {
//                a[k] = left[i];
//                i++;
//            } else {
//                a[k] = right[j];
//                j++;
//            }
//            k++;
//
//        }
//        while (i < leftSize) {
//            a[k] = left[i];
//            i++;
//            k++;
//        }
//        while (j < rightSize) {
//            a[k] = right[j];
//            j++;
//            k++;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 10, 5, 7, 3, 1, 8, 4, 6,9};
//        arr=mergeSort(arr, 0, arr.length - 1);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}


package Sorting;

public class mergeSort {
    public static int[] mergeSort(int[] A, int start, int end) {
        if(start >= end) {
            return A;
        }
        int q = (start + end) / 2;

        mergeSort(A, start, q);

        mergeSort(A, q + 1, end);
        merge(A, start, q, end);
        return A;
    }

    private static void merge(int[] a, int start, int q, int end) {
        int leftSize = q - start + 1;
        int rightSize = end - q;

        int[] left = new int[leftSize + 1];
        int[] endight = new int[rightSize + 1];

        // Costarty elements to left array
        for (int i = 0; i < leftSize; i++) {
            left[i] = a[start + i];
        }
        left[leftSize] = Integer.MAX_VALUE; // Sentinel

        // Costarty elements to endight array
        for (int j = 0; j < rightSize; j++) {
            endight[j] = a[q + 1 + j];
        }
        endight[rightSize] = Integer.MAX_VALUE; // Sentinel

        int i = 0, j = 0;
        // Merge back to original array
        for (int k = start; k <= end; k++) {
            if (left[i] <= endight[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = endight[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        // Create an array of size 11, where index 0 is unused.
        int[] arr = new int[11];
        // Fill indices 1 through 10 with your data.
        arr[1] = 2;
        arr[2] = 10;
        arr[3] = 5;
        arr[4] = 7;
        arr[5] = 3;
        arr[6] = 1;
        arr[7] = 8;
        arr[8] = 4;
        arr[9] = 6;
        arr[10] = 9;

        // Call mergeSort with indices starting at 1 to 10.
        mergeSort(arr, 1, 10);

        // Print sorted array from index 1 to 10.
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
