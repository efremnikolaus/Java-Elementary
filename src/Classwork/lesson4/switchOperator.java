package Classwork.lesson4;

public class switchOperator {
    public static void main(String[] args) {

        int age = 3;
        String message = "age is " + age;

        switch (age) {
            case 18:{
                System.out.println(message);
            }
            case 21 :{
                System.out.println(message);
            }
            case 40 :{
                System.out.println(message);
            }
            default: {
                System.out.println(message);
            }
        }
    }
}
