package Classwork.lesson4.CounterStrike;

import java.util.Scanner;

public class counterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первой команды: ");
        String firstTeamName = scanner.next();

        System.out.print("Альберт сделал убийств:  ");
        int firstAlbert = scanner.nextInt();
        System.out.print("Aллен сделал убийств: ");
        int firstAllen = scanner.nextInt();
        System.out.print("Берт сделал убийств: ");
        int firstBert = scanner.nextInt();
        System.out.print("Боб сделал убийств: ");
        int firstBob = scanner.nextInt();
        System.out.print("Сесил сделал убийств: ");
        int firstCecil = scanner.nextInt();

        System.out.print("Введите имя второй команды: ");
        String secondTeamName = scanner.next();

        System.out.print("Альфред сделал убийств: ");
        int secondAlfred = scanner.nextInt();
        System.out.print("Билл сделал убийств: ");
        int secondBill = scanner.nextInt();
        System.out.print("Брендон сделал убийств: ");
        int secondBrandon = scanner.nextInt();
        System.out.print("Келвин сделал убийств: ");
        int secondCalvin = scanner.nextInt();
        System.out.print("Дин сделал убийств: ");
        int secondDean = scanner.nextInt();

        float resultOne = (firstAlbert + firstAllen + firstBert + firstBob + firstCecil) / 5f;
        float resultTwo = (secondAlfred + secondBill + secondBrandon + secondCalvin + secondDean) / 5f;

        if(resultOne > resultTwo){
            System.out.println("Победила команда " + firstTeamName + " набравшая " + resultOne + " очков");
        }
        else if(resultOne < resultTwo){
            System.out.println("Победила команда " + secondTeamName + " набравшая " + resultTwo + " очков");
        }
        else{
            System.out.println("Игра окончена боевой ничьей!");
        }
    }
}
