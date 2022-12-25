package Classwork.lesson6;

import java.util.Scanner;

public class iterationCycles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int teamSize = 5;
        int[] team = new int[teamSize];
        int counter = 0;
        System.out.println("enter the frags for player");

        while(counter < teamSize){
            System.out.println("player frags " + counter);
            team[counter] = scanner.nextInt();
            counter++;

        }
        System.out.println("counter is " + counter);
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
}