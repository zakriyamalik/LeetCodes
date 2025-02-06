package Math;

public class FirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        if(nums.length==1&&nums[0]==target)
        {
            result[0]=nums[0];
            result[1]=nums[0];
            return result;
        }
        int left = 0;
        int right = nums.length - 1;
        boolean leftFound = false;
        boolean rightFound = false;
        int start=0,end=0;
        for (int i = 0; i < nums.length; i++) {

            if (!leftFound) {
                if (foundLeft(left, nums, target) == -1) {
                    left++;

                } else {
                    start=left;
                    leftFound=true;
                }
            }


            if (!rightFound) {

                if (foundRight(right, nums, target) == -1) {
                    right--;


                } else {
                    end=right;
                    rightFound=true;
                }
            }




        }
        if(leftFound&&rightFound)
        {
            result[0]=start;
            result[1]=end;
        }
        return result;

    }

    private int foundRight(int right, int[] nums, int target) {
        if(nums[right]==target)
        {
            return right;
        }
        else
        {
            return -1;
        }
    }

    private int foundLeft(int left, int[] nums, int target) {
        if(nums[left]==target)
        {
            return left;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args) {
        FirstAndLast firstAndLast = new FirstAndLast();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 5;
        int[] result = firstAndLast.searchRange(nums, target);
        System.out.println("The target is found at index: [" + result[0] + ", " + result[1] + "]");
    }
}
