package Classwork.lesson5;

public class newClass {
    public static void main(String[] args) {
        NewTest newTest = new NewTest();
        System.out.println("before method: var is " + newTest.variable);
        changeVar(newTest);
        System.out.println("after method: var is " + newTest.variable);
    }

    public static void changeVar(NewTest newTest) {
        System.out.println("inside method before change: var is " + newTest.variable);
        newTest.variable = 30;
        System.out.println("inside method after change: var is " + newTest.variable);
    }

    public void dum(int a, int b){
        a = 10;
    }

    static class NewTest {
        public int variable = 10;
    }
}
