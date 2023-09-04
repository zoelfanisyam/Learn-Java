package oop.latihan;

public class RunKue {
    public static void main(String[] args) {
        KuePolos kuePolos = new KuePolos("Original");
        kuePolos.topping();

        kuePolos = new KueKeju("Keju");
        kuePolos.topping();

        kuePolos = new KueKejuKacang("Keju Kacang");
        kuePolos.topping();

        String namaDepan = "Hisyam";
        String namaBelakang = "Hisyam";

        System.out.println(namaDepan.equals(namaBelakang));

    }
}
