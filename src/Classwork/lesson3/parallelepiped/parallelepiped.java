package Classwork.lesson3.parallelepiped;

public class parallelepiped {
    public static void main(String[] args) {

        int a = 7;
        int b = 8;
        int c = 15;

        int volume = a * b * c;
        System.out.println("Объем параллелепипеда = " + volume);

        int length = 4 * (a + b + c);
        System.out.println("Сумма длин всех ребер = " + length);
    }
}