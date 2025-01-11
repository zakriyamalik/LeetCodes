package Recursion;

import java.util.Scanner;

public class NaturalNumbersSum {
    private static int finding(int n) {
        if(n==0)
        {
            return 0;
        }
        int res=n+finding(n-1);
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number\n");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        n=finding(n);
        scanner.close();
        System.out.println("The sum of natural numbers from 1 to "+n+" is: "+n);
    }


}
