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
        int pivot=A[r];
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
        quickSort(arr, 1, 10);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
