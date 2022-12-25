package Classwork.lesson6.guessNumber;

import java.util.Scanner;

public class guessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userNumber = 0;
        int attempts= 0;
        int number = (int) (Math.random() * 10);
        System.out.println("Welcome, you have 5 chances, your task is that you need to guess a number from 0 to 10. Let's start ↓↓↓");

        while(!(number == userNumber)) {

            attempts++;
            if (attempts >= 6) {
                System.out.println("Unfortunately, you lost, you’ll get lucky next time :(");
                break;
            }

            System.out.print("Enter the number: ");
            userNumber = scanner.nextInt();

            if (userNumber > number){
                System.out.println("My number is smaller :(");
            }
            else if (userNumber < number) {
                System.out.println("My number is bigger :(");
            }
            else {
                System.out.println("Congratulations, u guessed :)");
            }
        }
    }
}