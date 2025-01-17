package Recursion;

import java.util.ArrayList;
import java.util.List;

public class findGoodNumber {
    int even=-2;
    int prime=-1;
    List<Integer> primeList=new ArrayList<>();
    public int countGoodNumbers(long n) {
        List<Integer> sub=new ArrayList<>();
        List<List<Integer>> combos=new ArrayList<>();
        for(int i=0;i<4;i++)
        {
            combos.add(check2(sub,n));
        }
        return combos.size();
    }

    private List<Integer> check2(List<Integer> sub,long n) {
        List<List<Integer>> tempCombos=new ArrayList<>();
        List<Integer> result ;
        if (sub.size()==n)
        {
            result=new ArrayList<>();
            result.addAll(sub);
            sub.clear();
            return result;
        }
        sub.add(generateNumber(sub.size(),sub));
       result= check2(sub,n);
        return result;

    }

    private Integer generateNumber(int index, List<Integer> sub) {

        int n=0;
        if(index%2==0)
        {
             n = generateEven();
        }
        else
        {
            int next=0;
            if(primeList.isEmpty()) {
                next = 0;
            }
            else
            {
                next = primeList.getLast() + 1;
            }

            if(generatePrime(next))
            {
                primeList.add(next);
            }
            else
            {
                while(!generatePrime(++next))
                {

                }
                primeList.add(next);
            }

             n=primeList.getLast();
        }
        return n;

    }

    private Boolean generatePrime(int number) {
        if (number<=1)
        {
            return false;
        }
        if(number==2) {
            return true;
        }
        for(int i=2;i<Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }


        return true;
    }

    private int generateEven() {
        even=even+2;
        return even;
    }

    public static void main(String[] args) {
        findGoodNumber fgn = new findGoodNumber();
        int count = fgn.countGoodNumbers(2);
        System.out.println(count);
    }
}
