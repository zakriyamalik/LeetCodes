import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //  int[] candidates = {2, 3, 6, 7};int target = 7;
        int last=0;
        int temp_target=target;
        int candiIndex=0,indexVal=0;
        int[] value = {0};
        List<List<Integer>> combos=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        for(int i=0;i<candidates.length;i++)
        {
           last= Initialiterate(i,sub,target,candidates);

        }

        return combos;
    }

    private int Initialiterate(int i, List<Integer> sub, int target, int[] candidates) {
        int temp_target=target;
        int last=0;List<List<Integer>> combos=new ArrayList<>();
        int candiIndex=0,indexVal=0;
        while (true)
        {
            last=temp_target-candidates[i];//7-2=5-2=3-2=-1
            if(last==0)
            {

            } else if (last<0) {

                last=sub.getLast();//last =-1
                break;
            }
            else
            {
                temp_target=last;
                sub.add(last);
            }
        }
        int[] value = {0};
        candiIndex=checkOtherCandidates(i,candidates,last,value);
        last=value[0];
        if(candiIndex==-1) {
            do {

                int last_index = sub.size() - 1;
                sub.remove(last_index);
                for (int j = 0; j < sub.size(); j++) {
                    System.out.println("j : " + j + " value : " + sub.get(j));
                }
                last = sub.getLast();
                candiIndex = checkOtherCandidates(i, candidates, last,value);


            } while (candiIndex == -1);
        }
        last=value[0];
        System.out.println("Updated last is curreted:\t"+last+"\n");
        indexVal = checkIndexValue(candiIndex, candidates, last);
        if (indexVal == 0) {
            System.out.println("value at index "+candiIndex +" "+candidates[candiIndex]);
            sub.add(indexVal);
            combos.add(sub);

        } else {
            System.out.println("Now index to deep is : "+candiIndex+" target is : "+ indexVal+" sub array is \t[ ");
            for(int j=0;j<sub.size();j++)
            {
                System.out.println(sub.get(j)+" ");
            }
            System.out.println("]\n");
            last = Initialiterate(candiIndex, sub, indexVal, candidates);

        }
        return last;

    }

    private int checkIndexValue(int candiIndex, int[] candidates,int last) {
        return candidates[candiIndex]-last;
    }

    private int checkOtherCandidates(int i, int[] candidates, int last,int[] value) {
        int temp_last;
        for(int j=0;j<candidates.length;j++)
        {
//            if(i!=j) {
//                temp_last = last - candidates[j];
//                // it will continue till value is -ve if something happens we send back the index of candidates and further checks will be performed on that index
//                if (temp_last >= 0) {
//                    return j;
//                }
//            }
            temp_last = last - candidates[j];
            // it will continue till value is -ve if something happens we send back the index of candidates and further checks will be performed on that index
            if (temp_last >= 0) {
                value[0]=temp_last;
                return j;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum.combinationSum(candidates, target);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
