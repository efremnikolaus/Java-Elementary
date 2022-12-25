package Classwork.lesson7.Operators;

public class orAnd {

    public static void main(String[] args) {
        int a = 23;

        if((a > 0) && (a < 100)) System.out.println("a is bigger than 0");
        //&& - and; || - or.
        else if ((a > 100) || (a > 1000)) System.out.println("a is bigger than 100");
    }
}
