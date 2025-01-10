package Recursion;

import java.util.Scanner;

public class Print {
    public static void printNumbers(int n) {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printNumbers(n-1);


    }

    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printNumbers(n);
        scanner.close();
        System.out.println("Done");
    }
}
