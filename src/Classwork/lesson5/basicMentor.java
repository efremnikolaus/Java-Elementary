package Classwork.lesson5;

import java.util.Scanner;

public class basicMentor {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("sorry bro args is empty");
        }
        else {
            System.out.println(args.length);
            System.out.println("hello " + args[0]);
        }
    }
}
