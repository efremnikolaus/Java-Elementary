package Classwork.lesson6.shuttleNumber;

public class firstMethod {
    public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i != 4 && j != 4 && i != 9 && j != 9 && i != 14){
                        System.out.println(i + "" + j);
                    }
                }
            }
    }
}
