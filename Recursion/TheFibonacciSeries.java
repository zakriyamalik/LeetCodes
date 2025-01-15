package Recursion;

public class TheFibonacciSeries {
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }

    public static void main() {
        TheFibonacciSeries fibonacciSeries = new TheFibonacciSeries();
        int i=4;
            System.out.println(fibonacciSeries.fib(i));

    }
}
