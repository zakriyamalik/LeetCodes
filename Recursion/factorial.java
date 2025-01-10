package Recursion;

import java.util.Scanner;

public class factorial {
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int smallerProb=factorial(n-1);
        int biggerProb=n*smallerProb;    // biggerProb=n*factorial(n-1)
        return biggerProb;               // return n*factorial(n-1);


    }
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res=factorial(n);
        scanner.close();
        System.out.println("Done\t"+res);
    }
}
