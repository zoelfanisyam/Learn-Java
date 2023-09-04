package oop.latihan;

public class KueKejuKacang extends KueKeju {

    KueKejuKacang(String nama) {
        super(nama);
    }

    public void topping() {
        System.out.println("Kue ini rasanya keju kacang");
    }
}
