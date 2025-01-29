package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
   public int key=0;
    public int j=0;

    public void sorting(int[] arr)
    {
        for(int i=1;i<arr.length;i++) {
            key=arr[i];
            j=i-1;

            while (j >= 0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
        System.out.println("Sorted Array is : "+ Arrays.toString(arr) +"\n");
    }

    public static void main() {
        int []num={5,1,4,3,9,5};
        InsertionSort insertionSort=new InsertionSort();
        insertionSort.sorting(num);


    }

}
