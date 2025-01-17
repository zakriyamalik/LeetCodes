package Recursion;

import java.util.ArrayList;
import java.util.List;

public class good2 {
    int count=0;
    int even=-2;
    int prime=1;
    public int countGoodNumbers(long n) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> combos=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        return getEven(combos,list,n).size();
    }

    private List<List<Integer>> getEven(List<List<Integer>> combos, List<Integer> list,long n) {
        count=0;
        even=-2;
        prime=1;
       int size= generateEven(combos,list).getLast().size();
        if(size<n)
        {
            getEven(combos,list,n);
        }
        return generateEven(combos,list);
    }

    private List<List<Integer>> generateEven(List<List<Integer>> combos,List<Integer> sub) {
        if(even+2>8)
        {
            return combos;
        }
        even=even+2;
        sub.clear();
        sub.add(even);
        generatePrime(combos,sub);
        prime=0;
        generateEven(combos,sub);
        return combos;
    }

    private List<List<Integer>> generatePrime(List<List<Integer>> combos,List<Integer> sub) {
        if(prime>8)
        {
            return combos;
        }
        while (!nextPrime(++prime) )
        {
            if (prime>=7)
            {
                break;
            }
        }
        if(prime>7) {
            return combos;
        }
        else {
            sub.add(prime);
            combos.get(count++).addAll(new ArrayList<>(sub));
           // System.out.println(count+++ "\n");
            for(int c:sub)
            {
                System.out.println(c+" ");
            }
            System.out.println("\n");
            sub.removeLast();
            generatePrime(combos, sub);
            return combos;
        }
    }

    private Boolean nextPrime(int prime) {
        if (prime<=1)
        {
            return false;
        }
        if(prime==2) {
            return true;
        }
        for(int i=2;i<=Math.sqrt(prime);i++)
        {
            if(prime%i==0)
            {
                return false;
            }
        }


        return true;

    }


    public static void main()
    {
        good2 good2= new good2();
        int n=good2.countGoodNumbers(4);

        System.out.println("Numbers are \t"+n);

    }
}
