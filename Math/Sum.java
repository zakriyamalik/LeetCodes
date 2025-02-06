package Math;

public class Sum {
        public int[] twoSum(int[] nums, int target) {
            // LinkedList<Integer> res = new LinkedList<Integer>();
            int[] res = new int[2];

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]&& i==j) {
                    } else {
                        if (nums[i] + nums[j] == target) {
                            res[0] = i;
                            res[1] = j;

                            break;
                        }
                    }

                }
            }
            return res;
        }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sum.twoSum(nums, target);
        System.out.println("The two indexes are: " + result[0] + " and " + result[1]);
    }
}