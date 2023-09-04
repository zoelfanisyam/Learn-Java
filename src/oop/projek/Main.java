package oop.projek;

public class Main {
    public static void main(String[] args) {
        Martabak martabak = new Keju();
        martabak.setNama("Keju");
        martabak.topping();

        martabak = new KejuKacang();
        martabak.setNama("Keju Kacang");
        martabak.topping();

        martabak = new KejuPisang();
        martabak.setNama("Keju Pisang");
        martabak.topping();

        martabak = new Coklat();
        martabak.setNama("Coklat");
        martabak.topping();

        martabak = new CoklatKacang();
        martabak.setNama("Coklat Kacang");
        martabak.topping();

        martabak = new CoklatPisang();
        martabak.setNama("Coklat Pisang");
        martabak.topping();
    }
}
