package Classwork.lesson4;


public class classBasic {
    public static void main(String[] args) {

        String name = "Bo";

        if ( name.equals("Bob")) {
            System.out.println("number is bigger than 0");
        }
        else if(name.length() > 2) {
            System.out.println("size is bigger than 3");
        }
        else if (name.length() > 1){
            System.out.println("size is bigger than 1");
        }
        else {
            System.out.println("else is executed");
        }
    }
}
