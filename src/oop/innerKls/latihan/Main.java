package oop.innerKls.latihan;

public class Main {
    public static void main(String[] args) {
        Toping keju = new Toping();
        keju.setNama("Keju ");

        Toping.SubTopping kejuKacang = keju.new SubTopping();
        kejuKacang.setNama(" Kacang");

        System.out.println(kejuKacang.getNama());
    }
}
