package oop.latihan;

/**
 * Kuda
 */
public class Kuda extends Hewan {

    Kuda(String nama) {
        super.nama = nama;
    }

    public void berjalan(String jalan) {
        System.out.println("Kuda yang bernama " + super.nama + " berjalan dengan " + jalan);
    }

    public void bersuara(String suara) {
        System.out.println("Suaranya" + super.nama + " seperti " + suara);
    }

    public String toString() {
        return "Kuda ini bernama" + this.nama;
    }

}