package Recursion;

public class PowerOfTwo {
    private static boolean isPowerOfTwo(int n) {
        int base=2;
        int power=0;

        return checkSecond(base,power,n);
    }

    private static boolean checkSecond(int base,int power,int n) {
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

    public static void main() {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }


}
