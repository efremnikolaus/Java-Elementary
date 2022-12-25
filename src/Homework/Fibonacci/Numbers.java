package Homework.Fibonacci;

import java.util.Scanner;
public class Numbers {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.print("enter any number: ");

        int n = sn.nextInt();
        int a = 0;
        int b = 1;
        int fib = 2;
        int i = 2;

        System.out.println("fibonacci number " + n + ":" );
        System.out.print(a + " " + b);
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
            System.out.print(" " + fib);
        }
    }
}
