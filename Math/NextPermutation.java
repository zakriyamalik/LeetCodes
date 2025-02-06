package Math;

import java.util.Arrays;

public class NextPermutation {
    public static int findPivot(int [] nums)
    {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            System.out.println("First: "+nums[i]+" Second: "+nums[i+1]+" with index " + i+"\n");
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                return pivot;
            }

        }
        return pivot;
    }
    public static int[] getAcs(int[] nums)
    {
        Arrays.sort(nums);
        return nums;
    }
    public static int[] nextPermutation(int[] nums) {
        int pivotIndex=findPivot(nums);
        System.out.println("Pivot Index: "+pivotIndex+" "+nums[pivotIndex]+"\n");
        if(pivotIndex==-1)
        {
            nums=getAcs(nums);
            return nums;
        }
        else
        {
            int smallValue=findSmall(nums, pivotIndex);
            int smallIndex= valuetoindex(nums,smallValue);
            System.out.println("Array after small index finding is \n");
            for(int num:nums)
            {
                System.out.print(num + " ");

            }
            System.out.println("\n");
            System.out.println("Small number :"+nums[smallIndex]+" with index "+smallIndex);
            int temp=nums[smallIndex];
            nums[smallIndex]=nums[pivotIndex];
            nums[pivotIndex]=temp;
            System.out.println("Array before reverse is \n");
            for(int num:nums)
                {
                System.out.print(num + " ");

            }
            System.out.println("\n");
            nums=reverse(nums, pivotIndex+1, nums.length-1);
            return nums;
        }

    }

    private static int valuetoindex(int[] nums, int smallValue) {
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==smallValue)
            {
                return i;
            }
        }
        return -1;
    }

    private static int[] reverse(int[] nums, int start, int end) {
        System.out.println("Starting point of reverse is "+start+" ending point of reverse is "+end);
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array after reverse is \n");
        for(int num:nums)
            {
                System.out.print(num + " ");

            }
        System.out.println("\n");

        return nums;
    }

    private static int findSmall(int[] nums, int pivotIndex) {
        int []temp=new int[nums.length];
        for (int i=0; i<nums.length; i++)
        {
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<nums.length;i++)
        {
            if(temp[i]>temp[pivotIndex])
            {
             return temp[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1};
        System.out.println("Original Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        nums=nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
