package Homework.Machine;

import java.util.Scanner;

public class Drinks {
    public static final double COFFEE_PRICE = 1.30;
    public static final double TEA_PRICE = 0.90;
    public static final double LEMONADE_PRICE = 2;
    public static final double MOJITO_PRICE = 2.30;
    public static final double MINERAL_PRICE = 1.5;
    public static final double COCA_COLA_PRICE = 1.2;
    public static double sum = 0;

    Scanner scanner = new Scanner(System.in);


    public void coffeePrepare() {
        System.out.println("A cup of coffee is price: " + COFFEE_PRICE + "₴");
        System.out.print("Enter the number of cups of coffee: ");
        int amount = scanner.nextInt();
        sum = sum + (amount * COFFEE_PRICE);
    }

    public void teaPrepare() {
        System.out.println("A cup of tea is price: " + TEA_PRICE + "₴");
        System.out.println("Enter the number of cups of tea: ");
        int amount = scanner.nextInt();
        sum = sum + (amount * TEA_PRICE);
    }

    public void lemonadePrepare() {
        System.out.println("A cup of lemonade is price: " + LEMONADE_PRICE + "₴");
        System.out.print("Enter the number of cups of lemonade: ");
        int amount = scanner.nextInt();
        sum = sum + (amount * LEMONADE_PRICE);
    }

    public void mojitoPrepare() {
        System.out.println("A cup of mojito is price: " + MOJITO_PRICE + "₴");
        System.out.print("Enter the number of cups of mojito: ");
        int amount = scanner.nextInt();
        sum = sum + (amount * MOJITO_PRICE);
    }

    public void mineralPrepare() {
        System.out.println("A cup of mineral water is price: " + MINERAL_PRICE + "₴");
        System.out.print("Enter the number of cups of mineral water: ");
        int amount = scanner.nextInt();
        sum = sum + (amount * MINERAL_PRICE);
    }

    public void coca_colaPrepare() {
        System.out.println("A cup of coca-cola is price: " + COCA_COLA_PRICE + "₴");
        System.out.print("Enter the number of cups of Coca-Cola: ");
        int amount = scanner.nextInt();
        sum = sum + (amount * COCA_COLA_PRICE);
    }

    public static double getSum() {
        return sum;
    }
}
