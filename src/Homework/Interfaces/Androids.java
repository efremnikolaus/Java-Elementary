package Homework.Interfaces;

public class Androids {
    public class Android extends LinuxOS implements Phones {

        @Override
        public void call() {
            System.out.println("Android call");
        }

        @Override
        public void sms() {
            System.out.println("Hello,you are using Android");
        }

        @Override
        public void internet() {

        }

        @Override
        public void Internet() {
            System.out.println("Internet works on android");
        }

        @Override
        void linuxOs() {

        }
    }

}
