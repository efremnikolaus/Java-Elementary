package Classwork.lesson7;

public class Person {
    public String name = "boris";
    public String surname;
    private int age = 18;
    public void setAge(int age){

        if(age > 0 && age < 101){
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    public void introduction(){

        System.out.println("hello my name is " + name + " and i am " + age);
    }

}
