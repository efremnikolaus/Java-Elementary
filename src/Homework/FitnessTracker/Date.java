package Homework.FitnessTracker;

public class Date {

    private final int birthOfDay;
    private final int birthOfMonth;
    private final int birthOfYear;

    public Date(int birthOfDay, int birthOfMonth, int birthOfYear) {
        this.birthOfDay = birthOfDay;
        this.birthOfMonth = birthOfMonth;
        this.birthOfYear = birthOfYear;
    }

    @Override
    public String toString() {
        return "Date{" +
                "birthOfDay=" + birthOfDay +
                ", birthOfMonth=" + birthOfMonth +
                ", birthOfYear=" + birthOfYear +
                '}';
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }
}
