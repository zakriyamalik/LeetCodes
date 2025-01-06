import java.util.ArrayList;
import java.util.List;

class TripleSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> nestedList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j != k && i != k) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> sub = new ArrayList<>();
                            sub.add(nums[i]);
                            sub.add(nums[j]);
                            sub.add(nums[k]);
                            boolean flag = false;
                            int counter = 0;
                            for (int x = 0; x < nestedList.size(); x++) {
                                for (Integer element : nestedList.get(x)) {
                                    if (element == sub.get(0) || element == sub.get(1) || element == sub.get(2)) {
                                        counter++;
                                    }

                                }
                                if (counter == 3) {
                                    flag = true;
                                    counter=0;
                                    break;
                                }
                                counter=0;




                            }
                            if (flag) {
                            } else {
                                nestedList.add(sub);
                            }
                        }

                    }
                }
            }
        }return nestedList;
    }

    public static void main(String[] args) {
        TripleSum tripleSum = new TripleSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = tripleSum.threeSum(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}