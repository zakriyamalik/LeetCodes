package Recursion;

public class PowerOfThree {

    private static boolean isPowerOfThree(int n) {
        int base=3;
        int power=0;

        return checkSecond(base,power,n);
    }

    private static boolean checkSecond(int base, int power, int n) {
        long result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        if(n==1||result==n)
        {
            return true;
        }
        if(result>n)
        {
            return false;
        }
        else
        {
            power++;
            return checkSecond(base,power,n);
        }
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfThree(n));
    }
}
