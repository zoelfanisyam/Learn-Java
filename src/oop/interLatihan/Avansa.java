package oop.interLatihan;

public class Avansa implements Car {
    @Override
    public void type() {
        System.out.println("Kendaraan ini bertype Car");
    }

    @Override
    public void namaMobil() {
        System.out.println("Nama kendaraan ini bernama Avansa");
    }

    void getMethod() {
        type();
        namaMobil();
    };
}
