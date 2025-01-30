public class TwoSumII {
    boolean flage=false;
    int left=0;int right=0;
    int sum=0;
    int[] result=new int[2];
    public int[] twoSum(int[] numbers, int target) {
        result[0]=0;
        result[1]=0;

        right=numbers.length-1;
        while(left<right)
        {
            sum= numbers[left]+numbers[right];
            if(sum==target)
            {
                result[0]=left+1;
                result[1]=right+1;
                flage=true;break;
            }
            if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
