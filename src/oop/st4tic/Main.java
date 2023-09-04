package oop.st4tic;

import static oop.st4tic.Hello.*;

public class Main {
    public static void main(String[] args) {

        // Non-Static Field
        Hello hallo = new Hello();
        System.out.println(hallo.a);

        // Static Field
        System.out.println(Hello.b);

        // Static Method
        Hello.hallo("Hisyam");

        // Non-Static Method
        hallo.helloNonStatic();

        // Static inner class
        Hello.InnerHello hallo1 = new Hello.InnerHello();
        hallo1.setNama("Hisyam");

        System.out.println(hallo1.getNama());

        // use to import static
        System.out.println(b);
    }
}
