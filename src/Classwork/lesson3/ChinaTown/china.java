package Classwork.lesson3.ChinaTown;

public class china {
    public static void main(String[] args) {

        int LeeWarrior = 13;
        int LeeArcher = 24;
        int LeeRider = 46;

        int MinWarrior = 9;
        int MinArcher = 35;
        int MinRider = 12;

        int LeeSum = (LeeWarrior + LeeArcher + LeeRider) * 860;
        System.out.println("Общий показатель атаки династии Лии: " + LeeSum);

        int MinSum = (int) (((MinWarrior + MinArcher + MinRider) * 860) * 1.5);
        System.out.println("Общий показатель атаки династии Минь: " + MinSum);

    }
}