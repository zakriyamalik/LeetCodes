package Recursion;

import java.util.ArrayList;
import java.util.List;

public class good2 {
    int count = 0;
    int even = -2;
    int prime = 1;

    public int countGoodNumbers(long n) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> combos = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        return getEven(combos, list, n).size();
    }

    private List<List<Integer>> getEven(List<List<Integer>> combos, List<Integer> list, long n) {
        int size = generateEven(combos, list).get(list.size() - 1).size();
        if (size < n) {
            getEven(combos, list, n);
        }
        return generateEven(combos, list);
    }

    private List<List<Integer>> generateEven(List<List<Integer>> combos, List<Integer> sub) {
        if (even + 2 > 8) {
            return combos;
        }
        even = even + 2;
        sub.add(even);
        generatePrime(combos, sub);
        generateEven(combos, sub);
        return combos;
    }

    private List<List<Integer>> generatePrime(List<List<Integer>> combos, List<Integer> sub) {
        if (prime > 8) {
            return combos;
        }
        int[] primeDigits = {2, 3, 5, 7};
        for (int primeDigit : primeDigits) {
            sub.add(primeDigit);
            combos.add(new ArrayList<>(sub));
            sub.remove(sub.size() - 1);
        }
        return combos;
    }

    public static void main(String[] args) {
        good2 goodNumbers = new good2();
        int n = goodNumbers.countGoodNumbers(4);
        System.out.println("Numbers are \t" + n);
    }
}
