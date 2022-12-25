package Homework.FitnessTracker;

public class Main {

    public static void main(String[] args) {

        User anna = new User("Anna", "Petrova",
                new Date(02, 11, 1992),
                new Contacts("123@gmai", "380637127264"),
                new FitInfo(62.0,"120/80", 13400));

        System.out.println(anna);
    }
}