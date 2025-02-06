package Math;

import java.util.*;

public class CombinationSum2 {
    private List<List<Integer>> combos=new ArrayList<>();
    List<Integer> sub=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        final int size=candidates.length;
        List<Integer> temp_arr=new ArrayList<>(size);


        for(int i=0;i<candidates.length;i++)
        {
            if(candidates[i]<=target)
            {
                temp_arr.add(candidates[i]);
            }

        }
        Collections.sort(temp_arr,Collections.reverseOrder());
        for(int i=0;i<temp_arr.size();i++)
        {
            if(temp_arr.get(i)>target)
            {
                temp_arr.remove(i);
            }
        }
        for(int i=0;i<temp_arr.size();i++)
        {
            System.out.println(temp_arr.get(i)+" ");
        }
        System.out.println("\n");
        calculate(temp_arr,target,0,sub);
        Set<List<Integer>> unique=removeDup(combos);
        List<List<Integer>> uniqueList = new ArrayList<>(unique);

        return uniqueList;
    }

    private void calculate(List<Integer> tempArr, int target,int start,List<Integer> sub) {
        int rem=0;

        for(int i=0;i<tempArr.size();i++)
        {
            if(i!=start-1) {


                sub.clear();
                rem = target - tempArr.get(i);
                if (rem == 0) {
                    sub.add(tempArr.get(i));
                    combos.add(new ArrayList<>(sub));
                    continue;

                }
                if (rem < 0) {
                    int result = calculateRem(tempArr, rem, i + 1, sub);
                    if (result == -1) {
                        sub.clear();
                    } else {
                        sub.add(tempArr.get(i));
                        combos.add(new ArrayList<>(sub));
                    }

                } else {
                    sub.add(tempArr.get(i));
                    int result = calculateRem(tempArr, rem, i + 1, sub);
                    if (result == -1) {
                        continue;
                    } else {
                        sub.add(tempArr.get(result));
                        combos.add(new ArrayList<>(sub));
                    }
                }
            }
        }
    }

    private int calculateRem(List<Integer> tempArr, int rem, int start, List<Integer> sub) {
        int result=-1;
        int target=rem;
        for(int i=0;i<tempArr.size();i++)
        {
            rem=target-tempArr.get(i);
            if(rem==0)
            {

                return i;

            }
            if(rem<0)
            {
               // calculateRem(tempArr, rem, i+1,sub);
                continue;
            }
            else
            {
//                sub.add(tempArr.get(i));
//                calculate(tempArr, rem, i+1,sub);

                //agr greater hai to dekhty hain
                target=rem;
                sub.add(tempArr.get(i));

            }
        }
        if(rem>0)
        {
            return -1;
        }
        return result;
    }
    private static Set<List<Integer>> removeDup(List<List<Integer>> result) {
        Set<List<Integer>> unique = new HashSet<>();

        for (List<Integer> list : result) {
            // Sort each list to remove duplicates irrespective of order
            List<Integer> sortedList = new ArrayList<>(list);
            Collections.sort(sortedList);
            unique.add(sortedList);
        }

        return unique;
    }

    public static void main(String[] args) {
        CombinationSum2 combinationSum2 = new CombinationSum2();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = combinationSum2.combinationSum2(candidates, target);
        Set<List<Integer>> unique=removeDup(result);
        System.out.println("\nDifferent Combos are \n");
        for (List<Integer> list : result) {
            System.out.println("\n[ ");
            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i)+" ");
            }
            System.out.println("\n]");
        }
    }


}
