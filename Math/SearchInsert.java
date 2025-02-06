package Math;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int res=-1;
        if(nums.length==1&&nums[0]==target)
        {
            res=1;
            return res;
        }
        if(target<nums[0])
        {
            res=0;
            return res;
        }
        if(target>nums[nums.length-1])
        {
            res=nums.length;
            return res;
        }

        for(int i=0;i<nums.length-1;i++)
        {
            res=checkRes(i,nums,target);
            if(res!=-1)
            {
                break;
            }

        }

    return res;
    }

    private int checkRes(int i, int[] nums,int target) {
        int res=-1;
        if(nums[i]==target)
        {
            res=i;
            return res;
        }
        if(nums[i+1]==target||nums[i]<target&&nums[i+1]>target)
        {
            res=i+1;
            return res;
        }
        return res;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert=new SearchInsert();
        int[] nums = {1};
        int target =1;
        int res= searchInsert.searchInsert(nums,target);

        System.out.println("Result is \t: "+res);

    }
}
