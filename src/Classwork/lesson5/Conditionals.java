package Classwork.lesson5;

public class Conditionals {

    public static String main(String[] args) {

        Double input = -21.19;

        String output;


        output = (input > 0.0) ? "positive" : "not positive";

        System.out.println(input + " is " + output);
        return output;
    }
}
