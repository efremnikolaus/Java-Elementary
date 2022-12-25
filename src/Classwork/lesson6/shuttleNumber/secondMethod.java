package Classwork.lesson6.shuttleNumber;

public class secondMethod {

    public static void main(String[] args) {

        int value = 0;
        int count = 0;
        while (count < 100) {
            String s = String.valueOf(++value);
            if ((s.contains("4") || s.contains("9"))) continue;
            System.out.println(value);
            count++;
        }
        System.out.println("In conclusion numbers: " + count);
    }
}