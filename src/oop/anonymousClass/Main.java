package oop.anonymousClass;

public class Main {
    public static void main(String[] args) {
        HelloWord sayHello = new HelloWord() {
            @Override
            public void sayHello() {
                System.out.println("Hallo nama saya Hisyam");
            }

            @Override
            public void sayHello(String nama) {
                System.out.println("Hallo " + nama);
            }
        };
        sayHello.sayHello("Hisyam");
    }
}
