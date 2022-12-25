package Classwork.lesson5;

public class variable {
    public static void main(String[] args) {
        int arg1 = 100;
        int sum = sumInt(4,5);

        System.out.println(sum);
        int argu1 = 10;
        int argumentTwo = 10;
        sumVoid(arg1, argumentTwo);
    }

    public static int sumInt (int arg1, int b) {
        return arg1 + b;
    }

    public static void sumVoid (int arg1, int arg2) {
        arg1 = arg1 + 100;
        System.out.println(arg1 + 1 + arg2 + 1);
        // return nichego
    }
}
