import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Permutation {
    List<List<Integer>> combos=new ArrayList<>();
    public List<List<Integer>> permute(int[] arr) {
        List<Integer> sub=new ArrayList<>();
        if(arr.length==1)
        {
            sub.add(arr[0]);
            combos.add(sub);
            return combos;
        }


        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                swap(arr, j, j+1);
                sub=new ArrayList<>();
                for(int k=0;k<arr.length;k++)
                {
                    sub.add(arr[k]);
                }
                System.out.println("New combo is \n");
                for(int k=0;k<sub.size();k++)
                {
                    System.out.println(sub.get(k)+" ");
                }
                combos.add(sub);
                // sub.clear();
            }


        }


        return combos;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Permutation permutation=new Permutation();
        // [5,4,6,2]
        int [] arr=new int[4];
        arr[0]=5;
        arr[1]=4;
        arr[2]=6;
        arr[3]=2;

        List<List<Integer>> lists=permutation.permute(arr);  // Starting from index 0 and ending at index 2 (length - 1)


        System.out.println("\n\nLists in main are\n");
        for(List<Integer> list:lists)
        {
            for (int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i)+" ");
            }
            System.out.println("\n");
        }


    }
}
