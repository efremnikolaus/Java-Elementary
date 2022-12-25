package Homework.Machine;

import java.util.Scanner;
import java.util.Arrays;

public class DrinksMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Drinks drinks = new Drinks();

        boolean count = true;
        while (count) {
            System.out.println("Choose a drink: ");
            System.out.println(Arrays.toString(ListOfDrinks.values()));
            String choice = sc.nextLine();

            choice = choice.toUpperCase();
            ListOfDrinks drinksMachine = ListOfDrinks.valueOf(choice);

            switch (drinksMachine) {
                case COFFEE:
                    drinks.coffeePrepare();
                    break;
                case TEA:
                    drinks.teaPrepare();
                    break;
                case LEMONADE:
                    drinks.lemonadePrepare();
                    break;
                case MOCHITO:
                    drinks.mojitoPrepare();
                    break;
                case MINERAL:
                    drinks.mineralPrepare();
                    break;
                case COLA:
                    drinks.coca_colaPrepare();
                default:
                    System.out.println("ERROR");
            }

            System.out.println("TOTAL PRICE : " + Drinks.getSum() );
            System.out.println("Would you like anything else?  Yes/No");

            boolean moreDrinks = true;
            while (moreDrinks) {
                String answer = sc.nextLine().toLowerCase();
                if (answer.equals("no")) {
                    moreDrinks = false;
                    count = false;
                } else if (answer.equals("yes")) {
                    moreDrinks = false;
                } else {
                    System.out.println("Answer - YES/NO");
                }
            }
        }
    }
}
