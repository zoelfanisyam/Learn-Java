package oop.latihan;

/**
 * Ayam
 */
public class Ayam extends Hewan {

    Ayam(String nama) {
        super.nama = nama;
    }

    public void berjalan(String jalan) {
        System.out.println("Ayam yang bernama " + super.nama + " berjalan dengan " + jalan);
    }

    public void bersuara(String suara) {
        System.out.println("Suaranya " + super.nama + " seperti " + suara);
    }

}