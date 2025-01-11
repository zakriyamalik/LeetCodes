package Recursion;

public class NumberInLine {
    public static void main(String[] args) {
        int n = 3;
        int res=finder(n);
        System.out.println("Result is : "+res);

   }

    private static int finder(int n) {
        if(n<=1)
        {
            return 1;
        }
        int res=1+finder(n-1);
        return res;
    }


}
