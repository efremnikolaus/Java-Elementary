package Homework.FitnessTracker;

public class Contacts {

    private final String mail;
    private final String phone;

    public Contacts(String mail, String phone) {
        this.mail = mail;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
