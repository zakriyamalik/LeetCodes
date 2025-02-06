package Math;

class RotatedSorted {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RotatedSorted rotatedSorted = new RotatedSorted();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};//can rotate
        int target = 0;
        int result = rotatedSorted.search(nums, target);
        System.out.println("The target is found at index: " + result);
    }
}