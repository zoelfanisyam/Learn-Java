package oop.interLatihan;

public interface Bus extends Kendaraan {
    default void namaBus() {
        System.out.println("Kendaraan ini bertype Hallo");
    }
}
