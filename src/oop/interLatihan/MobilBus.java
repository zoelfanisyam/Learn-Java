package oop.interLatihan;

public class MobilBus implements Car, Bus {
    @Override
    public void type() {
        System.out.println("Kendaraan ini bertype Bus atau Mobil");
    }

    @Override
    public void namaMobil() {
        System.out.println("Kendaraan ini bernama Bus Elef");
    }

    void getElef() {
        type();
        namaMobil();
    }
}
