package oop.latihan;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        var ayam1 = new Ayam("Hisyam");
        var kuda1 = new Kuda("Alfi");

        ayam1.berjalan("2 Kaki");
        ayam1.bersuara("Kuk kuruyuk");

        kuda1.berjalan("4 Kaki");
        kuda1.bersuara("Kekekekek");
        System.out.println(kuda1.toString());

        var uang = new SayHello();

        uang.setUang(0);
        uang.getUang();

    }
}