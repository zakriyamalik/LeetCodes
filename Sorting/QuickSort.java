package Sorting;

public class QuickSort {
    public static void quickSort(int[] A, int p, int r) {
        if(p<r)
        {
            int partition=Partition(A,p,r);
            quickSort(A,p,partition-1);
            quickSort(A,partition+1,r);

        }
    }

    private static int Partition(int[] A, int p, int r) {
        int pivot=A[(p+r)/2];
        int i=p;
        int j=r;
        int temp=0;
        while(i<j)
        {
            while(A[i]<pivot)
            {
                i++;
            }
            while(A[j]>pivot)
            {
                j--;
            }
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;

        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {2, 10, 5, 7, 3, 1, 8, 4, 6,9};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
