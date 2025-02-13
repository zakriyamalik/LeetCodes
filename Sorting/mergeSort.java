package Sorting;

public class mergeSort {
    public static int[] mergeSort(int[] A, int p, int r) {
        if(p>=r)
        {
            return A;
        }
        int q=(p+r)/2;
        mergeSort(A,p,q);
        mergeSort(A,q+1,r);
        merge(A,p,q,r);
        return A;

    }

    private static void merge(int[] a, int p, int q, int r) {
        int leftSize=q-p+1;
        int rightSize=r-q;
        int[] left = new int[leftSize + 1];
        int[] right = new int[rightSize + 1];
        for (int i = 0; i < leftSize; i++) {
            left[i] = a[p + i];
        }
        left[leftSize] = Integer.MAX_VALUE;
        for (int j = 0; j < rightSize; j++) {
            right[j] = a[q + 1 + j];
        }
        right[rightSize] = Integer.MAX_VALUE;
        int i = 0, j = 0, k = p;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;

        }
        while (i < leftSize) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            a[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        arr=mergeSort(arr, 0, arr.length - 1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
